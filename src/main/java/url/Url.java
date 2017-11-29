package url;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

  public String getProtocolo() {
    return protocolo;
  }

  public String getHost() {
    return host;
  }

  public String getDominio() {
    return dominio;
  }

  public String getPath() {
    return path;
  }

  public String getParametros() {
    return parametros;
  }

  private String protocolo;
  private String host;
  private String dominio;
  private String path;
  private String parametros;
  private boolean valida;

  public Url (String url){
    String[] urlpartes = new String[20];
    urlpartes = url.split("/");
    if(urlpartes.length > 3){
      this.protocolo = urlpartes[0];
      System.out.println("host: "+this.protocolo);
      String dominio = urlpartes[2];
      String[] dominiotes = dominio.split("\\.");
      System.out.println("host: "+dominiotes[0]);
      this.host = dominiotes[0];
      String dominioCompleto = dominiotes[1];
      for(int i = 2;i<dominiotes.length;i++){
        dominioCompleto += "."+dominiotes[i];
      }
      System.out.println("dominio: "+dominioCompleto);
      this.dominio = dominioCompleto;
      System.out.println("path: "+urlpartes[3]);
      this.path = urlpartes[3];
      String parametros = "";
      for(int i = 4;i<urlpartes.length;i++){
        parametros += "/"+urlpartes[i];
      }
      System.out.println("parametros: "+parametros);
      this.parametros = parametros;
      this.valida = true;
    } else {
      this.valida = false;
    }
  }

  public boolean ehValida() {
    return this.valida;
  }
}
