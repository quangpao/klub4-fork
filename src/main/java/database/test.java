/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import org.mindrot.jbcrypt.*;


/**
 *
 * @author sonsi
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = "123456";
        System.out.println(""+password);
        System.out.println(BCrypt.hashpw(password, BCrypt.gensalt()));
        System.out.println(BCrypt.hashpw("1567723", BCrypt.gensalt()));
        System.out.println(BCrypt.hashpw(password, BCrypt.gensalt()));
        String t1 = (BCrypt.hashpw(password, BCrypt.gensalt()));
        String t2 = (BCrypt.hashpw(password, BCrypt.gensalt()));
        System.out.println(BCrypt.checkpw(password, t1));
        System.out.println(BCrypt.checkpw(password, t2));

    }
}
