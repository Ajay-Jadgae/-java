class Details {
    public static void main(String args[]) {
        
        long altoCarNumber = 9876543210L;
        long swiftCarNumber = 8765432109L;
        long innovaCarNumber = 7654321098L;
        long tharCarNumber = 6543210987L;
        long fortunerCarNumber = 5432109876L;
        
        long[] carNumbers = {altoCarNumber, swiftCarNumber, innovaCarNumber, tharCarNumber, fortunerCarNumber};
        System.out.println(carNumbers[2]);
        
        long newCarNumber = 1122334455L;
        carNumbers[2] = newCarNumber;
        System.out.println(carNumbers[2]);
        
        for(int BMW=0; BMW<carNumbers.length; BMW++) {
            System.out.println("Car Number= " + carNumbers[BMW]);
        }
        
        int raviAge = 25;
        int pavanAge = 30;
        int snehaAge = 28;
        int kavyaAge = 35;
        int rameshAge = 40;
        
        int[] ages = {raviAge, pavanAge, snehaAge, kavyaAge, rameshAge};
        System.out.println("----------------------");
        System.out.println(ages[1]);
        
        int updatedAge = 29;
        ages[1] = updatedAge;
        System.out.println(ages[1]);
        
        for(int num=0; num<ages.length; num++) {
            System.out.println("Employee Age= " + ages[num]);
        }
        
        String bengaluruCity = "Bengaluru";
        String mysuruCity = "Mysuru";
        String hubliCity = "Hubli";
        String mangaloreCity = "Mangalore";
        String shivamoggaCity = "Shivamogga";
        
        String[] cities = {bengaluruCity, mysuruCity, hubliCity, mangaloreCity, shivamoggaCity};
        System.out.println("----------------------");
        System.out.println(cities[4]);
        
        String updatedCity = "Tumakuru";
        cities[4] = updatedCity;
        System.out.println(cities[4]);
        
        for(int location=0; location<cities.length; location++) {
            System.out.println("City= " + cities[location]);
        }
        
        float raviSalary = 25000.5f;
        float pavanSalary = 30000.75f;
        float snehaSalary = 28000.25f;
        float kavyaSalary = 35000.0f;
        float rameshSalary = 40000.9f;
        
        float[] salaries = {raviSalary, pavanSalary, snehaSalary, kavyaSalary, rameshSalary};
        System.out.println("----------------------");
        System.out.println(salaries[0]);
        
        float updatedSalary = 27000.0f;
        salaries[0] = updatedSalary;
        System.out.println(salaries[0]);
        
        for(int Num=0; Num<salaries.length; Num++) {
            System.out.println("Salary= " + salaries[Num]);
        }
        
        char raviGrade = 'A';
        char pavanGrade = 'B';
        char snehaGrade = 'A';
        char kavyaGrade = 'C';
        char rameshGrade = 'B';
        
        char[] grades = {raviGrade, pavanGrade, snehaGrade, kavyaGrade, rameshGrade};
        System.out.println("----------------------");
        System.out.println(grades[3]);
        
        char updatedGrade = 'A';
        grades[3] = updatedGrade;
        System.out.println(grades[3]);
        
        for(int Names=0; Names<grades.length; Names++) {
            System.out.println("Grade= " + grades[Names]);
        }
        
        boolean raviResult = true;
        boolean pavanResult = false;
        boolean snehaResult = true;
        boolean kavyaResult = true;
        boolean rameshResult = false;
        
        boolean[] results = {raviResult, pavanResult, snehaResult, kavyaResult, rameshResult};
        System.out.println("----------------------");
        System.out.println(results[1]);
        
        boolean updatedResult = true;
        results[1] = updatedResult;
        System.out.println(results[1]);
        
        for(int marks=0; marks<results.length; marks++) {
            System.out.println("Result= " + results[marks]);
        }
        
        double raviMarks = 88.5;
        double pavanMarks = 76.0;
        double snehaMarks = 92.3;
        double kavyaMarks = 81.2;
        double rameshMarks = 69.7;
        
        double[] marks = {raviMarks, pavanMarks, snehaMarks, kavyaMarks, rameshMarks};
        System.out.println("----------------------");
        System.out.println(marks[2]);
        
        double updatedMarks = 95.0;
        marks[2] = updatedMarks;
        System.out.println(marks[2]);
        
        for(int max=0; max<marks.length; max++) {
            System.out.println("Marks= " + marks[max]);
        }
    }
}
