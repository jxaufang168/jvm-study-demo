package tech.flygo.jvm.course02;

/**
 * @description: 类加载器层级关系
 * @author: flygo
 * @time: 2022/10/19 16:22
 */
public class L01ClassLoaderLevel01 {

  public static void main(String[] args) {
    System.out.println(String.class.getClassLoader());
    System.out.println(sun.awt.HKSCS.class.getClassLoader());
    System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
    System.out.println(L01ClassLoaderLevel01.class.getClassLoader());

    System.out.println(
        sun.net.spi.nameservice.dns.DNSNameService.class
            .getClassLoader()
            .getClass()
            .getClassLoader());
    System.out.println(L01ClassLoaderLevel01.class.getClassLoader().getClass().getClassLoader());
    System.out.println(ClassLoader.getSystemClassLoader());
  }
}
