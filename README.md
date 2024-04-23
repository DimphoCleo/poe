# poe
public class RegisterAndLogInPart1POE {

    public static void main(String[] args) {
        signUpUser();
       //Prompt user to input name and surname
       String name = JOptionPane.showInputDialog( null,"Please enter your username and password to log in");
       JOptionPane.showMessageDialog( null,"Welcome!" + name);
    }
        public static void signUpUser(){
            boolean validUsername = false;
            boolean validPassword = false;
            String username= "";
            String password = "";
         
            
            //validate the username
            while(!validUsername){
                username = 
      
      //Prompt the user to create a username 
       JOptionPane.showInputDialog(null,"Please create a username that contains an underscore is no more than five charcters long");
                if (username != null && isValidUsername (username)){
                    validUsername = true;
                }
                       
                else {
            
           JOptionPane.showMessageDialog( null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length. Please try again.");   
                }
      
                            }  
            //validate the password
            while (!validPassword){
                password = 
          
            //Prompt the user to create a password
       JOptionPane.showInputDialog( "Please create a password that's atleast 8 characters long, contains a capital letter,a number and a special character.");
                if (password != null && isValidPassword (password)){
                    validPassword = true;
                }
                else {
                           JOptionPane.showMessageDialog( null, "Password is not correctly formatted, please enesure that your password is atleast 8 characters long, contains a capital letter, a number amd a special character. Please try again.");
                       }
            }
            // register the user
           
            JOptionPane.showMessageDialog( null,"Your account has been successfully created!\nUsername:" + username + "\nPassword" + password);
        }

    private static boolean isValidPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
  

