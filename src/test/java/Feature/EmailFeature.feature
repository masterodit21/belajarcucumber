Feature: Tentukan apakah email memiliki format yang valid atau tidak

  Scenario: valid email
    Given saya memasukan email "budi@mail.com"
    When saya test formatnya
    Then hasilnya harus "true"

    Scenario: Invalid Email
      Given saya memasukan email "budi"
      When saya test formatnya
      Then hasilnya harus "false"
