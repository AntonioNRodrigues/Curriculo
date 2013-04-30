/*
 * Classe que permite ler o conteudo das pastas nos paths definidos 
 * pelo Work_in_JavaNewVersion.jsp através do @Override do init(). 
 * Nesse momento é criada uma instancia da classe ReadTextDefinePath. 
 * Essa informação da classe ReadTextDefinePath serve para iniciar 
 * os argumentos path e pathOther.
 * Cada um dos atributos, através do respectivo metodo set, 
 * passa pelo metodo lerConteudoPasta ou pelo metodo 
 * lerConteudoFicheiro para que as respectivas listas sejam preenchidas.
 */
package model.suport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author António Rodrigues
 */
public class ReadingSimpleWay {
    private String path;
    private String pathOther;
    private ArrayList listaJavaPasta;
    private ArrayList listaJavaOutraPasta;
    private ArrayList listaJSPOutrasPasta;
    private ArrayList<StringBuilder> listaCompletaJavaPasta;
    private ArrayList<StringBuilder> listaCompletaJavaOutraPasta;
    private ArrayList<StringBuilder> listaCompletaJSPOutraPasta;
    
    /*construtor
     * inicialização de todos os atributos bem como dos respectivos set de 
     * cada um. inicializa também as atributos path e pathOther através da 
     * classe ReadTextDefinePath.
     */
    public ReadingSimpleWay() {
        
        listaJavaPasta = new ArrayList();
        listaCompletaJavaPasta = new  ArrayList<StringBuilder>();
        listaJSPOutrasPasta= new ArrayList();
        listaCompletaJSPOutraPasta = new ArrayList<StringBuilder>();
        listaJavaOutraPasta= new ArrayList();
        listaCompletaJavaOutraPasta= new ArrayList<StringBuilder>();
        setPath(ReadTextDefinePath.getPathAUTO());
        setPathOther(ReadTextDefinePath.getPathAUTOClassesSite());
        setListaJavaPasta(listaJavaPasta);
        setListaCompletaJavaPasta(listaCompletaJavaPasta);
        setListaJSPOutrasPasta(listaJSPOutrasPasta);
        setListaCompletaJSPOutraPasta(listaCompletaJSPOutraPasta);
        setListaJavaOutraPasta(listaJavaOutraPasta);
        setListaCompletaJavaOutraPasta(listaCompletaJavaOutraPasta);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPathOther() {
        return pathOther;
    }

    public void setPathOther(String pathOther) {
        this.pathOther = pathOther;
    }

    public ArrayList getListaJavaPasta() {
        return listaJavaPasta;
    }
    /* Set do atributo listaJavaPasta que ira chama o metodo lerConteudoPasta 
     * para preencher a Lista com o conteúdo referente à pasta definida na 
     * atributo path. atributo de controlo para durante o ciclo do metodo 
     * lerConteudoPasta saber que ficheiros ha-de adicionar a Lista.
     */
    public void setListaJavaPasta(ArrayList listaJavaPasta) {
        String controlo="java";
        this.listaJavaPasta = lerConteudoPasta(listaJavaPasta, getPath(), controlo);
    }

    public ArrayList<StringBuilder> getListaCompletaJavaPasta() {
        return listaCompletaJavaPasta;
    }
      /* Set do atributo ListaCompletaJavaPasta que ira chamar o metodo 
     * lerConteudoFicheiro para preencher a Lista com o conteúdo referente 
     * à lista e à path definidos nos argumentos desse metodo.
     */
    public void setListaCompletaJavaPasta(ArrayList<StringBuilder> listaCompletaJavaPasta) {
        this.listaCompletaJavaPasta = lerConteudoFicheiro(listaJavaPasta, getPath());
    }

    public ArrayList getListaJSPOutrasPasta() {
        return listaJSPOutrasPasta;
    }
    /* Set do atributo ListaJSPOutrasPasta que ira chama o metodo lerConteudoPasta 
     * para preencher a Lista com o conteúdo referente a pasta definida na 
     * atributo path. atributo de controlo para durante o ciclo do metodo 
     * lerConteudoPasta saber que ficheiros ha-de adicionar à Lista.
     */
    public void setListaJSPOutrasPasta(ArrayList listaJSPOutrasPasta) {
         String controlo="jsp";
        this.listaJSPOutrasPasta = lerConteudoPasta(listaJSPOutrasPasta, getPathOther(), controlo);
    }

    public ArrayList<StringBuilder> getListaCompletaJSPOutraPasta() {
        return listaCompletaJSPOutraPasta;
    }
    /* Set do atributo ListaCompletaJSPOutraPasta que ira chamar o metodo 
     * lerConteudoFicheiro para preencher a Lista com o conteudo referente 
     * à lista e à path definidos nos argumentos desse metodo.
     */
    public void setListaCompletaJSPOutraPasta(ArrayList<StringBuilder> listaCompletaJSPOutraPasta) {
        this.listaCompletaJSPOutraPasta = lerConteudoFicheiro(listaJSPOutrasPasta, getPathOther());
    }

    public ArrayList getListaJavaOutraPasta() {
        return listaJavaOutraPasta;
    }
    /* Set do atributo ListaJavaOutraPasta que irá chama o metodo lerConteudoPasta 
     * para preencher a Lista com o conteúdo referente à pasta definida na 
     * atributo path. atributo de controlo para durante o ciclo do metodo 
     * lerConteudoPasta saber que ficheiros há-de adicionar à Lista.
     */
    public void setListaJavaOutraPasta(ArrayList listaJavaOutraPasta) {
        String controlo="javaOutra";
        this.listaJavaOutraPasta = lerConteudoPasta(listaJavaOutraPasta, getPathOther(), controlo);
    }

    public ArrayList<StringBuilder> getListaCompletaJavaOutraPasta() {
        return listaCompletaJavaOutraPasta;
    }
    /* Set do atributo ListaCompletaJavaOutraPasta que irá chamar o metodo 
     * lerConteudoFicheiro para preencher a Lista com o conteúdo referente 
     * à lista e à path definidos nos argumentos desse metodo.
     */
    public void setListaCompletaJavaOutraPasta(ArrayList<StringBuilder> listaCompletaJavaOutraPasta) {
        this.listaCompletaJavaOutraPasta = lerConteudoFicheiro(listaJavaOutraPasta, getPathOther());
    }

    /*metodo que recebe 3 argumentos. */
    private ArrayList lerConteudoPasta(ArrayList aSerPreenchida, String path, String controlo){
        try{
            File folder= new File(path);
            String [] sArray= folder.list();
            aSerPreenchida= new ArrayList();
            String ext1= ".j";
            String ext2=".jspage";

           if(controlo.equals("java")){
               for(int i=0; i<sArray.length; i++){
                if(sArray[i].endsWith(ext1)){
                    aSerPreenchida.add(sArray[i]);
                    //System.out.println("Java" + aSerPreenchida);
                    }
                }
    
           }else if(controlo.equals("jsp")){
                for(int i=0; i<sArray.length; i++){
                if(sArray[i].endsWith(ext2)){
                    aSerPreenchida.add(sArray[i]);
                    // System.out.println("JSP");
                    }
                }
               
           } else if(controlo.equals("javaOutra")){
               for(int i=0; i<sArray.length; i++){
                if(sArray[i].endsWith(ext1)){
                    aSerPreenchida.add(sArray[i]);
                   // System.out.println("Other");
                    }
                }
           }    
        }catch(Exception e){   
            Logger.getLogger(ReadTextBeanFormat.class.getName()).log(Level.SEVERE, null, e);
        }
        return aSerPreenchida;
    }
    
    /*metodo que recebe 2 argumentos*/
    private ArrayList<StringBuilder> lerConteudoFicheiro(ArrayList listaPreenchida, String path){
            
        ArrayList<StringBuilder> listaSerDevolvida= new ArrayList();
        String temp1=null;
        List l= listaPreenchida;
        BufferedReader ler;
            
                for(Object o:l){
                    StringBuilder s= new StringBuilder();
                    try {
                        String temp=(String)o;
                        File ficheiros= new File(path, temp);
                        ler=new BufferedReader(new FileReader(ficheiros));
                        while((temp1=ler.readLine())!=null){
                           s.append(temp1 + "\n");     
                    }
                    }catch (IOException ex) {
                    Logger.getLogger(ReadTextBeanFormat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   listaSerDevolvida.add(s);
                }

        return listaSerDevolvida;
    }

}
