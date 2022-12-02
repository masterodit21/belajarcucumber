Feature: Add Customer from costumer module

  Scenario: Input data customer
    Given ada di halaman dashboard
    When tekan menu customer
    When ada di halaman customer
    When ceklis done
    When isi first name "tedy"
    When isi last name "aditia"
    When isi email "tedy@mail.com"
    When isi address "jl. mawar"
    When isi mobile phone "089667364373"
    When klik submit
    Then dapat kode customer


