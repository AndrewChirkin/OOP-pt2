//import java.time.LocalDate;
//import java.util.jar.JarEntry;
//
//public class Human {
//    private int yearOfBirth;
//    private final String name;
//    private String town;
//    private String jobTitle;
//    public Human(String name, String town, int yearOfBirth, String jobTitle){
//        this.name = name;
//        if (town == null && town.isBlank() && town.isEmpty()) {
//            this.town = "Информация не указана";
//        }else {
//            this.town = town;
//        }
//        if(yearOfBirth < 0){
//            this.yearOfBirth = Math.abs(yearOfBirth);
//        }else if (yearOfBirth < 100){
//            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
//        }else {
//        this.yearOfBirth = yearOfBirth;
//        }
//        if(jobTitle == null && jobTitle.isBlank() && jobTitle.isEmpty()){
//            this.jobTitle = "безработный";
//        }else {
//            this.jobTitle = jobTitle;
//        }
//    }
//    public String getName(){
//        return this.name;
//    }
//    public String getTown(){
//        return this.town;
//    }
//
//    public void setTown(String town) {
//        if(town != null && !town.isBlank() && !town.isEmpty()){
//        this.town = town;
//        }else {
//            System.out.println("Информация не указана.");
//        }
//    }
//    public int getYearOfBirth(){
//       return this.yearOfBirth;
//    }
//    public void setYearOfBirth(int yearOfBirth){
//        if(yearOfBirth < 0){
//            this.yearOfBirth = Math.abs(yearOfBirth);
//        }else if (yearOfBirth < 100){
//            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
//        }else {
//            this.yearOfBirth = yearOfBirth;
//        }
//    public String getJobTitle(){
//        return this.jobTitle;
//    }
//    public void setJobTitle(String jobTitle){
//        if(jobTitle == null && jobTitle.isEmpty() && jobTitle.isBlank()){
//            this.jobTitle = "безработный";
//        }else {
//            this.jobTitle = jobTitle;
//        }
//    }
//    void greeting(){
//        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
//    }
//    public String toString(){
//        return getName() + "\nГород - " + getTown() + "\nГод рождения: " + getYearOfBirth() + "\nПрофессия/должность: " + getJobTitle();
//    }
//////    public int getAge(){
//////        return LocalDate.now().getYear() - yearOfBirth;
////    }
//}
//}