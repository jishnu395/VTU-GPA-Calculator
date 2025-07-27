
public class Sem_Subjects {
    public static Subject[] getSubjects(int sem) {
        switch (sem) {
            case 1:
                return new Subject[]{
                        new Subject("Mathematics-I", "BMATS101", 4),
                        new Subject("Communicative English", "BENGK106", 1),
                        new Subject("Innovation and Design Thinking", "BIDTK158", 1),
                        new Subject("Physics", "BPHYS102", 4),
                        new Subject("Emerging Technological Course-I", "BETCK105X", 3),
                        new Subject("Principles of Programming Using 'C'", "BPOPS103", 3),
                        new Subject("Engineering Science Course-I", "BESCK104X", 3),
                        new Subject("Balake/Samskrutika Kannada", "BKBKK107/BKSKK107", 1)
                };

            case 2:
                return new Subject[]{
                        new Subject("Mathematics-II", "BMATS201", 4),
                        new Subject("Professional Writing Skills in English", "BPWSK206", 1),
                        new Subject("Scientific Foundations of Health", "BSFHK258", 1),
                        new Subject("Chemistry", "BCHES202", 4),
                        new Subject("Emerging Technological Course-II", "BETCK205X", 3),
                        new Subject("Computer Aided Engineering Drawing", "BCEDK203", 3),
                        new Subject("Engineering Science Course-II", "BESCK204X", 3),
                        new Subject("Indian Constitution", "BICOK207", 1)
                };

            case 3:
                return new Subject[]{
                        new Subject("Mathematics for Computer Science", "BCS301", 4),
                        new Subject("Digital Design & Computer Organization", "BCS302", 4),
                        new Subject("Operating Systems", "BCS303", 4),
                        new Subject("Data Structures and Applications", "BCS304", 3),
                        new Subject("Data Structures Lab", "BCSL305", 1),
                        new Subject("Social Connect and Responsibility", "BSCK307", 1),
                        new Subject("Project Management with GIT", "BCS358C", 1),
                        new Subject("Object Oriented Programming with Java", "BCS306A", 3)
                };

            case 4:
                return new Subject[]{
                        new Subject("Biology for Computer Engineers", "BBOC407", 2),
                        new Subject("Analysis & Design of Algorithms", "BCO402", 4),
                        new Subject("Database Management Systems", "BCS403", 4),
                        new Subject("Elements of Cyber Security & IoT", "BIC401", 3),
                        new Subject("Cyber Security Lab", "BICL404", 1),
                        new Subject("Universal Human Values", "BUHK408", 1),
                        new Subject("Data Analytics for IoT", "BCO456A", 1),
                        new Subject("Discrete Mathematical Structures", "BCS405A", 3)
                };

            case 5:
                return new Subject[]{
                        new Subject("Software Engineering & Project Management", "BCS501", 4),
                        new Subject("Computer Networks", "BCS502", 4),
                        new Subject("Theory of Computation", "BCS503", 4),
                        new Subject("Environmental Studies and E-waste Management", "BCS508", 1),
                        new Subject("Mini Project", "BIC586", 2),
                        new Subject("IoT Lab", "BICL504", 1),
                        new Subject("Research Methodology and IPR", "BRMK557", 3),
                        new Subject("Professional Elective Course", "BCS515X/BIC515X", 3)
                };

            case 6:
                return new Subject[]{
                        new Subject("Microcontrollers & Embedded Systems", "BCO601", 4),
                        new Subject("Cryptography & Network Security", "BCY602", 4),
                        new Subject("Project Phase-I", "BIC685", 2),
                        new Subject("Vulnerability Assessment and Penetration Testing Laboratory", "BICL606", 1),
                        new Subject("Ability/Skill Enhancement Course–V", "BXX657x", 1),
                        new Subject("Open Elective Course", "BXX654X", 3),
                        new Subject("Professional Elective Course", "BXX613X", 3)
                };

            case 7:
                return new Subject[]{
                        new Subject("IOT Communication Protocols", "BCO701", 4),
                        new Subject("Blockchain Technology", "BIC702", 4),
                        new Subject("Machine Learning", "BIC703", 4),
                        new Subject("Major Project Phase-II", "BIC786", 6),
                        new Subject("Open Elective Course", "BIC755X", 3),
                        new Subject("Professional Elective Course", "BXX714X", 3)
                };

            case 8:
                return new Subject[]{
                        new Subject("Internship", "Intern", 16)
                };

            default:
                return null;
        }
    }
}
