class Q1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("In Child Thread");
                }
            }
        });

        // Printing on main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("In Main Thread");
        }

        // Printing in child thread
        t1.start();
    }
}