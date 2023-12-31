
package Proxy.LabTask;
public class SmartReferenceProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public SmartReferenceProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (isSupportedFileType()) {
         if (realImage == null) {
            realImage = new RealImage(fileName);
         }
         realImage.display();
      } else {
         System.out.println("Fake display for unsupported image type: " + fileName);
      }
   }

   private boolean isSupportedFileType() {
      // Add logic to determine if the file type is supported
      return fileName.endsWith(".jpg") || fileName.endsWith(".png");
   }
}