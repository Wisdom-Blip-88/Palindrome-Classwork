package OOP_1;

public class User {
    String name;
    String password;


    String login(){
      return "logged In";
    }

    String Register(){
        if(name.equals("Daniel") || password.equals("1234")){
            return "can't be Empty";
        }
        else {
            return "Successfully Registered";
        }
    }
}
