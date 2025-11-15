# Flight Booking End-to-End Test Automation  
Bu proje, Selenium WebDriver kullanılarak geliştirilmiş bir **uçtan uca (E2E) uçuş rezervasyon otomasyon testidir**.  
Kullanıcı davranışlarını taklit ederek uçuş arama, şehir seçimi, tarih seçimi, yolcu sayısı ayarlama ve döviz seçimi gibi fonksiyonların doğrulanmasını sağlar.

---

## Projenin Amacı  
Gerçek bir uçuş rezervasyonu senaryosunun otomasyonunu sağlayarak:

- Web UI test otomasyon becerilerini sergilemek  
- XPath/CSS seçicileri profesyonel şekilde kullanmak  
- Dropdown, alert, calendar picker gibi UI elementleri otomasyonla yönetmek  
- Selenium + Java ile E2E bir iş akışını uçtan uca test etmek  

hedeflenmiştir.

---

## Kullanılan Teknolojiler

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **ChromeDriver**
- **XPath & CSS Selectors**
- **Maven** (opsiyonel)

---

## Senaryo Adımları

Test aşağıdaki adımları otomatik olarak gerçekleştirir:

1. Web sitesine giriş  
2. Kalkış şehri seçimi (**BLR**)  
3. Varış şehri seçimi (**MAA**)  
4. Takvimden tarih seçimi  
5. Tek yön (One Way) uçuş seçimi  
6. Return tarihinin doğru şekilde “disabled” olduğunu doğrulama  
7. Yolcu sayısını arttırma  
8. Döviz seçim dropdown’ından bir değer seçme  
9. Uçuş arama butonuna tıklama  

Otomasyon başarıyla tamamlandığında tüm fonksiyonlar doğrulanmış olur.

---




