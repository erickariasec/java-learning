package poo;

public class TestConstant {

    public static void main(String[] args) { // Step 1: Create, left empty

        // Step 6: Instantiate EmployeeTest Class / Create objects belonging to EmployeeTest Class
        EmployeesTest Employee1= new EmployeesTest("Juan");
        EmployeesTest Employee2= new EmployeesTest("Carla");
      //Class Name | Object Name|OperatorNew|CONSTRUCTOR|Parameters
      //              Instance

       Employee1.changeJobSection("Marketing");

        System.out.println(Employee1.returnEmployeeData());
        System.out.println(Employee2.returnEmployeeData());

    }

    static class EmployeesTest{     // Step 2: Create Class

        public EmployeesTest(String nam){       // Step 4: Create Constructor Method
            name=nam;
            jobSection="Administration";
        }

                                                // Step 5: Build Setters and Getters
        public void changeJobSection(String jobSection){        // SETTER
            this.jobSection=jobSection;
        }


        public String returnEmployeeData(){         // GETTER
            return "The name is: " + name + " and the section is: " + jobSection;
        }

        private final String name;      // CONSTANT
        private String jobSection;      // Step 3: Create instance fields or class fields

    }

}
