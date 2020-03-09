/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.json.simple;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
       // System.out.println(new App().getGreeting());

       JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
    }
}
