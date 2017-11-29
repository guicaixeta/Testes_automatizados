package url;

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlTest {
  @Test
  public void deveSerUmaUrlValida() throws Exception{
    assert (new Url("http://globoesporte.globo.com/go/futebol/times/goias").ehValida());
  }

  @Test
  public void deveSerUmaUrlInvalida() throws Exception{
    assertFalse(new Url("htp://globoesporte.globo").ehValida());
  }

  @Test
  public void deveTerParametrosCertos() throws Exception{
    Url url = new Url("http://www.google.com/mail/user=fulano");
    assertEquals (url.getProtocolo(),"http:");
    assertEquals (url.getHost(),"www");
    assertEquals (url.getDominio(), "google.com");
    assertEquals (url.getPath(), "mail");
    assertEquals(url.getParametros(), "/user=fulano");
  }
}
