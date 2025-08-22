class SolarSystem {

    public static int planetInfo(String planet, int distance) {

        int moons = 0; 

        if (planet==("Mercury") && distance < 60) {
            moons = 58;
            System.out.println("Distance from Sun million km="+moons);
 
        } else if (planet==("Venus") && distance < 120) {
            moons = 108;
            System.out.println("Distance from Sun  million km="+moons);
        } else if (planet==("Earth") && distance < 160) {
            moons = 150;
            System.out.println("Distance from Sun  million km="+moons);
        } else if (planet==("Mars") && distance < 250) {
            moons = 228;
            System.out.println("Distance from Sun million km="+moons);
        } else if (planet==("Jupiter") && distance < 800) {
            moons = 778;
            System.out.println("Distance from Sun  778 million km="+moons);
        } else if (planet==("Saturn") && distance < 1500) {
            moons = 83;
            System.out.println("Distance from Sun billion km="+moons);
        } else if (planet==("Uranus") && distance < 3000) {
            moons = 27;
            System.out.println("Distance from Sun  billion km="+moons);
        } else if (planet==("Neptune") && distance < 5000) {
            moons = 14;
            System.out.println("Distance from Sun billion km="+moons);
        } else {
            System.out.println("Sorry, we don’t have information about ");
            
        }

        return moons;
    }
    
    }
