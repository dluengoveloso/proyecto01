//package cl.delv.inicial.proyecto01;
//
//
//import cl.delv.inicial.proyecto01.other.Telephone001;
//
//
//import org.junit.Test;
//
//import uk.co.jemos.podam.api.PodamFactoryImpl;
//
//import java.lang.reflect.Method;
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.Assert.assertNotNull;
//
//
//public class TestXml {
//
//    /**
//     * The dtos.
//     */
//    private static Map<Class, Object> dtos = new HashMap<>();
//
//    /**
//     * The podam.
//     */
//    private static PodamFactoryImpl podam = new PodamFactoryImpl();
//
//    static {
//        // DTO
//        dtos.put(Telephone001.class, podam.manufacturePojo(Telephone001.class));
//    }
//
//    @Test
//    public void checkRequestTestOK1() {
//        for (Map.Entry<Class, Object> dto : dtos.entrySet()) {
//            for (Method method : dto.getKey().getDeclaredMethods()) {
//                try {
//                    int size = method.getParameterTypes().length;
//                    Object[] args = new Object[size];
//                    method.invoke(dto.getValue(), args);
//                } catch (Exception e) {
//                }
//            }
//        }
//        Telephone001 dto1 = new Telephone001();
//        Telephone001 dto2 = new Telephone001();
//
//        dto1.hashCode();
//        dto1.equals(dto2);
//
//        assertNotNull(dto1);
//
//
//    }
//
//
//}
