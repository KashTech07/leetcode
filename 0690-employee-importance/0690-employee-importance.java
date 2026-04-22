/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int ans = 0 ;
        for(Employee e : employees){
            if(e.id==id){
                ans+=e.importance ;
               for(int n : e.subordinates){
                ans = ans + getImportance(employees , n) ;
               }
            }
        }
        return ans ;
    }
}