تمرین اول طراحی شی گرایی


تغییرات مربوط به روش جدید ارسال پیام
=======
| عضو | کلاس تغییر یافته | توضیحات |
|------------------------|-----------|----------|
|نجیبی| افزودن کلاس SmsSender.java |ایجاد کلاس جدید SmsSender و متد sendSmsMessage(String to, String message) برای فعال‌سازی ارسال تاییدیه از طریق پیامک |
|نجیبی| reservationservice | افزودن یک case جدید (case sms :) به ساختار switch برای تصمیم‌گیری و فراخوانی متد جدید smsSender.sendSmsMessage(). |



تغییرات مربوط به روش جدید پرداخت
=======
| عضو | کلاس تغییر یافته | توضیحات |
|------------------------|-----------|----------|
|انوری|PaymentProcessor | افزودن متد عمومی onSitePayment(double amount) برای پیاده‌سازی مکانیزم پرداخت حضوری در سیستم. |
| انوری |ReservationService| افزودن یک case جدید (case ONSITE:) به ساختار switch در متد makeReservation برای فراخوانی متد جدید paymentProcessor.onSitePayment() |

 
