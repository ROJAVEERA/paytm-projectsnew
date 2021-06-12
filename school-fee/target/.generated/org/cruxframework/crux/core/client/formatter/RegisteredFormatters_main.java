package org.cruxframework.crux.core.client.formatter;

import org.cruxframework.crux.core.client.formatter.Formatter;
import org.cruxframework.crux.core.client.collection.FastMap;

public class RegisteredFormatters_main implements org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters {
  public RegisteredFormatters_main(){ 
  }
  public Formatter getClientFormatter(String id){
    return clientFormatters.get(id);
  }
  private FastMap<Formatter> clientFormatters = new FastMap<Formatter>();
}
