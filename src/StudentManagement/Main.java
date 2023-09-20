package StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudenManager clazz = new StudenManager();
        double[] point1 = {5.8,5.2,8};
        Student student1 = new Student("lâm", "nam", point1);
        double[] point2 = {7.2,6.5,8};
        Student student2 = new Student("đề", "nam", point2);
        double[] point3 = {4.2,5.8,8.7};
        Student student3 = new Student("dân", "nam", point3);
        double[] point4 = {3.2,5,8};
        Student student4 = new Student("hiếu", "nam", point4);
        clazz.add(student1);
        clazz.add(student2);
        clazz.add(student3);
        clazz.add(student4);
        System.out.println("danh sách sinh viên");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);

        }
        clazz.edit(3,student4);
        System.out.println("danh sách sinh viên sau sửa :");
        for (int i = 0; i < clazz.getSize(); i++) {
            System.out.println(clazz.getListStudent()[i]);

        }
        System.out.println("điểm trung bình của lớp là :" + clazz.getAvgClazz());
        System.out.println("điểm trung bình lớn nhất là :" + clazz.getMaxAvg());
        System.out.println("danh sách sinh viên có chữ l : ");
        for (Student student : clazz.getStudentByName("l")) {
            System.out.println(student);
            
        }

//        System.out.println("sinh viên cần tìm");
//        System.out.println(clazz.findStudentById(1));

//        clazz.delete(2);
//        System.out.println("danh sách sinh viên sau khi xóa :");
//        for (int i = 0; i < clazz.getSize(); i++) {
//            System.out.println(clazz.getListStudent()[i]);
//
//        }


    }
}
