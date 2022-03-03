/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School;
import School.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Yosef SOFTWARE
 */
public class SourceCode {
    
    
}
class classchanger{
    public void Rigestrar(){
    Registrar_Signin A = new Registrar_Signin();
    A.setVisible(true);
    }
    public void Teacher(){
    Teachers_Signin A = new Teachers_Signin();
    A.setVisible(true);
    }
    public void SeeG(){
    seegrsde A = new seegrsde();
    A.setVisible(true);
    }
    public void Students(){
    Students_Signin A = new Students_Signin();
    A.setVisible(true);
    }
    public void Rpage(){
        
    Registrar_page A = new Registrar_page();
    A.setVisible(true);
    }
    public void Tpage(){
    Teachers_page A = new Teachers_page();
    A.setVisible(true);
    }
    public void Spage(){
    Students_Page A = new Students_Page();
    A.setVisible(true);
    }
    public void About(){
    About A = new About();
    A.setVisible(true);
    }
    public void close(){
    System.exit(0);
    }
    public void CTP(){
    changeTpass A = new changeTpass();
    A.setVisible(true);
    }
    public void AG(){
    addgrade A = new addgrade();
    A.setVisible(true);
    }
    
    
}
class Rpage{
    public void AddT(){
    Add_teacher A = new Add_teacher();
    A.setVisible(true);
    }
    public void AddS(){
    Add_Student A = new Add_Student();
    A.setVisible(true);
    }
    
    
}
class back{
public void FP(){
signinchoose A = new signinchoose();
A.setVisible(true);
}

}
class delet{
public void DT(){
delet_teacher A = new delet_teacher();
A.setVisible(true);
}
public void ST(){
delet_student A = new delet_student();
A.setVisible(true);
}

}








