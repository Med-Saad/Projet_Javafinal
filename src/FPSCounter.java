public class FPSCounter {
    private int frameCount = 0;  // Nombre d'images rendues
    private long lastTime = System.currentTimeMillis(); // Dernière mise à jour
    private int currentFPS = 0;


    public void frameRendered() {
        frameCount++;

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime >= 1000) {
            currentFPS = frameCount; // Met à jour le FPS
            frameCount = 0;
            lastTime = currentTime;
        }
    }


    public int getFPS() {
        return currentFPS;
    }
}
