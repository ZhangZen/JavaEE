/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDefaultMethod;

/**
 *
 * @author Zhang
 */
public class Theory_README_first {
    /*
    * Những đặc điểm quan trọng về phương thức default trong interface:

        1. Phương thức default giúp chúng ta mở rộng interface mà không phải lo ngại phá vỡ các class được implements từ nó
        2. Phương thức default giúp chúng ta tránh dùng các class tiện ích, 
            ví dụ như tất cả phương thức của class Collections có thể được cung cấp ngay bên trong interface của nó
        3. Phương thức default giúp chúng ta tháo gỡ các class cơ sở (base class), 
            chúng ta có thể tạo phương thức default và trong class được implement có thể chọn phương thức để override
        4. Một trong những lý do xuất hiện của phương thức default là để nâng cấp Collection API trong Java 8
            hỗ trợ cho Lambda Expression.
        5. Nếu bất kỳ class nào kế thừa những phương thức default giống nhau, thì nó sẽ không còn hiệu lực. 
            Một điều tương tự, một phương thức default sẽ không thể override một phương thức từ java.lang.Object. 
            Lý do rất đơn giản là bởi vì Object là base class của tất cả các class trong Java. 
            Vì vậy nếu chúng ta có các phương thức của class Object được định nghĩa là phương thức default trong interface, 
            nó sẽ không dùng được bởi vì các phương thức của Object luôn luôn được sử dụng. 
            Đây lý do tại sao chúng ta sẽ không có bất cứ phương thức default nào override các phương thức của class Object.
        6. Phương thức default cũng có thể được gọi là phương thức Defender (Defender Methods) 
            hay là phương thức Virtual mở rộng (Virtual extension methods)

    * Chú ý:

        1. Phương thức default được thực hiện trên JVM mang lại hiệu quả
            và được hỗ trợ các chỉ dẫn byte code cho phương pháp gọi. 
            Phương thức default cho phép các Java interface đã tồn tại phát triển thêm mà không gây lỗi trong quá trình biên dịch. Ví dụ như bổ sung các phương thức vào interface java.util.Collection: stream(), parallelStream(), forEach(), removeIf()…
        2. Mặc dù vậy, phương thức default cũng cần được sử dụng một cách cần thận bởi nguyên nhân:
            Trước khi khai báo phương thức là default, 
            cần chắc chắn là nó là cần thiết bị nó có thể gây ra sự nhập nhằng và biên dịch lỗi trong hệ thống phân cấp phức tạp.
    */
}
