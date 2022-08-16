package br.edu.ifba.saj.ads.poo.model;


import java.awt.Event;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.*;

import br.edu.ifba.saj.ads.poo.LoginDialog;

public class votação extends javax.swing.JFrame {
@Override
    public boolean action(Event evt, Object what) {
      
        return super.action(evt, what);
    }



    @Override
    public void add(PopupMenu popup) {
      
        super.add(popup);
    }



    @Override
    public synchronized void addComponentListener(ComponentListener l) {
       
        super.addComponentListener(l);
    }



    @Override
    public synchronized void addFocusListener(FocusListener l) {
        
        super.addFocusListener(l);
    }



    @Override
    public void addHierarchyBoundsListener(HierarchyBoundsListener l) {
        
        super.addHierarchyBoundsListener(l);
    }



    @Override
    public void addHierarchyListener(HierarchyListener l) {
        
        super.addHierarchyListener(l);
    }



    @Override
    public synchronized void addInputMethodListener(InputMethodListener l) {
        
        super.addInputMethodListener(l);
    }



    @Override
    public synchronized void addKeyListener(KeyListener l) {
        
        super.addKeyListener(l);
    }



    @Override
    public synchronized void addMouseListener(MouseListener l) {
        
        super.addMouseListener(l);
    }



    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        
        super.addMouseMotionListener(l);
    }



    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
        
        super.addMouseWheelListener(l);
    }



    
    @Override
    public Rectangle bounds() {
        
        return super.bounds();
    }



public votação(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }



public votação(String title) throws HeadlessException {
        super(title);
    }



public votação(GraphicsConfiguration gc) {
        super(gc);
    }



public votação() {
    }



/**
 * @param Args
 */
public static void main (String [] Args){
int votoUm=0;
int votoDois=0;
int votoNulo=0;
String candidatoUm;
String candidatoDois;
int Nulo;
int voto;
char pergunta;
final int contaV1;
int contaV2;
int contaN;
 pergunta = 'S';
    candidatoUm = JOptionPane.showInputDialog("QUAL SERÁ O CANDIDATO UM?");
    candidatoDois = JOptionPane.showInputDialog("QUAL SERÁ O CANDIDATO DOIS?");
    
    do
    {
    voto = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO DE VOTO: \n [1] " + candidatoUm + "\n [2] " + candidatoDois + "\n [0] Nulo/Branco")); 
    
    
    
    
    if (voto < 0 || voto > 2)
    {
                
        JOptionPane.showMessageDialog(null, "NÚMERO DE VOTO INCORRETO!!!");
        
        while ((voto < 0) || (voto > 2))
        {
        voto = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO DE VOTO: \n [1] " + candidatoUm + "\n [2] " + candidatoDois + "\n [0] Nulo/Branco")); 
        }
        
              
    }
    
    if (voto != 999)
    {
    pergunta = JOptionPane.showInputDialog("VOCÊ DESEJA CONFIRMAR SEU VOTO?").charAt(0); 
    }
   
   if (pergunta == 'S' || pergunta == 's')
   {
       System.out.println("VOTO CONFIRMADO!!!");
       
       if (voto == 1)
       {
           votoUm = votoUm + voto;
       }
       if (voto == 2)
       {
           votoDois = votoDois + voto;
       }
       if (voto == 0)
       {
           votoNulo = votoNulo + voto;
       }
      
   }
   
   
   // parte do não
   if (pergunta == 'N' || pergunta == 'n')
   {
       JOptionPane.showMessageDialog(null, "REPITA SEU VOTO:");
       voto = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO DE VOTO: \n [1] " + candidatoUm + "\n [2] " + candidatoDois + "\n [0] Nulo/Branco")); 
       
       if (voto != 999)
       {
        if (voto < 0 || voto > 2)
    {
        JOptionPane.showMessageDialog(null, "NÚMERO DE VOTO INCORRETO!!!");
        
        while (voto < 0 || voto > 2)
        {
        voto = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO DE VOTO: \n [1] " + candidatoUm + "\n [2] " + candidatoDois + "\n [0] Nulo/Branco")); 
            
        }
    } 
       }
        pergunta = JOptionPane.showInputDialog("VOCÊ DESEJA CONFIRMAR SEU VOTO?").charAt(0); 
   
   if (pergunta == 'S' || pergunta == 's')
   {
       System.out.println("VOTO CONFIRMADO!!!");
       
       if (voto == 1)
       {
           votoUm = votoUm + voto;
       }
       if (voto == 2)
       {
           votoDois = votoDois + voto;
       }
       if (voto == 0)
       {
           votoNulo = votoNulo + voto;
       }
      
   }
        
    }
    pergunta = JOptionPane.showInputDialog("DESEJA ENCERRAR VOTAÇÃO?").charAt(0);
    if (pergunta == 'S' || pergunta == 's') {
        break;
    }else{
        continue;
    }
    } while (voto != 999);
    if (votoUm > votoDois)
       {
           System.out.println("O VENCEDOR DA ELEIÇÃO FOI: " + candidatoUm + " COM: " + votoUm + " VOTOS");
       }
       if (votoDois > votoUm)
       {
           System.out.println("O VENCEDOR DA ELEIÇÃO FOI: " + candidatoDois + " COM: " + votoDois + " VOTOS");
       }
       if (votoNulo > votoUm && votoNulo > votoDois)
       {
           System.out.println("NÃO HOUVE VENCEDOR, OS VOTOS NULOS FORAM MAIORES.");
       }
       
       
       System.out.println("A QUANTIDADE DE VOTOS NULOS/EM BRANCO FOI DE: " + votoNulo);
       System.exit(1);
       
   
}



@Override
public String toString() {
    return "votação []";
}




}

