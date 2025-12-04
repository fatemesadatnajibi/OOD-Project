تمرین اول طراحی شی گرایی
تغییرات مربوط به روش جدید پرداخت 
کلاس تغییر یافته:PaymentProcessor
توضیح کوتاه در مورد تغییر: افزودن متد عمومی onSitePayment(double amount) برای پیاده‌سازی مکانیزم پرداخت حضوری در سیستم.
کلاس تغییر یافته:ReservationService
توضیح کوتاه در مورد تغییر: افزودن یک case جدید (case ONSITE:) به ساختار switch در متد makeReservation برای فراخوانی متد جدید paymentProcessor.onSitePayment()

