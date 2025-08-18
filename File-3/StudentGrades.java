class StudentGrades {
    public static void main(String[] args) {

        char gradeMath = 'A';
        char gradeScience = 'B';
        char gradeEnglish = 'A';
        char gradeHistory = 'C';
        char gradeGeography = 'B';
        char gradeComputer = 'A';
        char gradeHindi = 'B';
        char gradeSports = 'A';

        char[] subjectGrades = {
            gradeMath, gradeScience, gradeEnglish, gradeHistory,
            gradeGeography, gradeComputer, gradeHindi, gradeSports
        };

        for (int subjectIndex = 0; subjectIndex < subjectGrades.length; subjectIndex++) {
            char grade = subjectGrades[subjectIndex];
            System.out.println("Subject Grade= " + grade);
        }
    }
}
