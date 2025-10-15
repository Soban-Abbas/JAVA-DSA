public class stringimutabel {
    public static void main(String[] args) {
        // once the string is created we cannot chnage its content in memory
        // this is called immutibility

        String name="Soban";
        String firstname=name;
        name=name+"Abbas";
        //When you do name + " Abbas", Java creates a new string "Soban Abbas" // The old "Soban" still exists, but now name points to the new one.
       System.out.println(name);
       System.out.println("First name :" +firstname);



       //substring
       //spaces are skiped by substring like in Soban Abbas  4 index value //is n and 5 index value is A
       String part=name.substring(3,7);
       System.out.println("Substring :" +part);

    }
}
