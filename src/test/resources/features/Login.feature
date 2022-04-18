@login_sayfası
Feature: Ozan SuperApp

  @Geçerli_kullanıcı_ile_uygulamaya__giriş_yapma
  Scenario Outline: Geçerli kullanıcı ile uygulamaya giriş yapma
    And Uygulamanın alt menüsünden hesap seçeneğine tıklanır
    And Uygulamaya başarılı giriş için <email> ve <password> yazılır
    And Başarılı şekilde uygulamaya giriş yapıldığı kontrol edilir

    Examples:
      | email | password |
      | oktyuyar@gmail.com  | 12345 |

  @Geçersiz_kullanıcı_ile_uygulamaya_giriş_yapma
  Scenario: Geçersiz kullanıcı ile uygulamaya giriş yapma
    And Uygulamanın alt menüsünden hesap seçeneğine tıklanır
    And Uygulamaya başarısız giriş için "oktyuyar@gmail.com" ve "12345" yazılır
    And Uygulamaya giriş yapılamadığı kontrol edilir

