
package Proxy.LabTask;
public class RemoteProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public RemoteProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (realImage == null) {
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}
