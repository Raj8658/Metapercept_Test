/*3. Create JSON object any detail
E.g. EmployeeData = {{fname:”abc”, lname:”xyz”, id: 1}, {fname:”abc”, lname:”xyz”, id: 2}}
Apply CURD operation on that JSON Data.*/




import org.json.JSONArray;
import org.json.JSONObject;

public class Third_EmployeeDataProcessor {
    
    private static JSONArray employeeData = new JSONArray();

    public static void CreateEmployee(String fname, String lname, int id){
        JSONObject employee=new JSONObject();
        employee.put("fname", fname);
        employee.put("lname", lname);
        employee.put("id", id);
        employeeData.put(employee);
    }

    public static void readEmployeeData(){
        System.out.println("Employee Data: \n" + employeeData.toString(2));
    }

    public static void updateEmployee(int index, String key, Object value){
        if (index>=0 && index < employeeData.length()){
            JSONObject employee = employeeData.getJSONObject(index);
            employee.put(key, value);
        } 
        else{
            System.out.println("Invalid index for update operation. ");
        }
    } 

    public static void deleteEmployee(int index){
         if (index>=0 && index < employeeData.length()){
            employeeData.remove(index);
         } 
         else {
            System.out.println("Invalid index for delete operation. ");
         }
    }

    public static void main(String[] args) {
        CreateEmployee("John", "Doe", 1);
        CreateEmployee("Jane", "Smith", 2);

        readEmployeeData();

        updateEmployee(0, "lname", "Johnson");
        readEmployeeData();

        deleteEmployee(1);
        readEmployeeData();
    }
}
