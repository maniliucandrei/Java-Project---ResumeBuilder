import java.util.ArrayList;
import java.util.Scanner;

class Resume {
    private String name;
    private String email;
    private String phone;
    private ArrayList<String> education;
    private ArrayList<String> workExperience;
    private ArrayList<String> skills;

    public Resume() {
        education = new ArrayList<>();
        workExperience = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addEducation(String educationDetails) {
        education.add(educationDetails);
    }

    public void addWorkExperience(String experienceDetails) {
        workExperience.add(experienceDetails);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void displayResume() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

        System.out.println("\nEducation:");
        for (String edu : education) {
            System.out.println("- " + edu);
        }

        System.out.println("\nWork Experience:");
        for (String exp : workExperience) {
            System.out.println("- " + exp);
        }

        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }
}

class ResumeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resume resume = new Resume();

        System.out.println("Welcome to the Resume Builder App!");

        System.out.print("Enter your name: ");
        resume.setName(scanner.nextLine());

        System.out.print("Enter your email: ");
        resume.setEmail(scanner.nextLine());

        System.out.print("Enter your phone number: ");
        resume.setPhone(scanner.nextLine());

        // Input education details
        System.out.println("Enter your education details (press Enter to stop):");
        while (true) {
            System.out.print("> ");
            String education = scanner.nextLine();
            if (education.isEmpty()) {
                break;
            }
            resume.addEducation(education);
        }

        // Input work experience details
        System.out.println("Enter your work experience (press Enter to stop):");
        while (true) {
            System.out.print("> ");
            String experience = scanner.nextLine();
            if (experience.isEmpty()) {
                break;
            }
            resume.addWorkExperience(experience);
        }

        // Input skills
        System.out.println("Enter your skills (press Enter to stop):");
        while (true) {
            System.out.print("> ");
            String skill = scanner.nextLine();
            if (skill.isEmpty()) {
                break;
            }
            resume.addSkill(skill);
        }

        // Display the resume
        System.out.println("\nYour Resume:");
        resume.displayResume();

        scanner.close();
    }
}