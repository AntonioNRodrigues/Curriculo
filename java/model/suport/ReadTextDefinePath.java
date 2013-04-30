/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.suport;

/**
 *
 * @author Antonio Rodrigues
 */
public class ReadTextDefinePath {
    private static String pathAUTO;
    private static String pathAUTOClassesSite;//path generada automaticamente, através do @Override do init() no file Work_in_JavaNewVersion

    public ReadTextDefinePath(String path) {
        setPathAUTO(path);
    }
    public ReadTextDefinePath(String path, String pathClassesSite){
        setPathAUTO(path);
        setPathAUTOClassesSite(pathClassesSite);
    }
        
    public static String getPathAUTO() {
        return pathAUTO;
    }

    public void setPathAUTO(String path) {
        this.pathAUTO = path;
    }
    
    
      public static String getPathAUTOClassesSite() {
        return pathAUTOClassesSite;
    }

    public static void setPathAUTOClassesSite(String pathAUTOClassesSite) {
        ReadTextDefinePath.pathAUTOClassesSite = pathAUTOClassesSite;
    }

  
}
