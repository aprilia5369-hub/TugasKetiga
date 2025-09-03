# TugasKetiga
# Abstract class
Adalah kelas yang didefinisikan dengan kata kunci abstract dan tidak dapat dibuat objek secara langsung. Kelas ini bisa berisi method biasa maupun method abstrak, yaitu method tanpa isi yang harus diimplementasikan oleh kelas turunannya. Abstract class berfungsi sebagai kerangka dasar bagi kelas turunan, memaksa turunan untuk mengimplementasikan method abstrak, dan mendukung polymorphism karena objek turunan dapat diperlakukan sebagai objek abstract class.

# Overloading
Adalah teknik di mana sebuah kelas memiliki beberapa method dengan nama yang sama, tetapi berbeda dalam parameter, baik jumlah, tipe, atau urutannya. Return type bisa sama atau berbeda, namun itu tidak memengaruhi overloading. Overloading memberikan fleksibilitas dalam pemanggilan method dengan variasi input yang berbeda, sehingga kode menjadi lebih ringkas dan konsisten.

# Overriding
terjadi ketika sebuah subclass menulis ulang method yang ada di superclass dengan nama, parameter, dan return type yang sama. Biasanya menggunakan anotasi @Override untuk memperjelas bahwa method tersebut meng-override. Overriding memungkinkan subclass memberikan perilaku yang lebih spesifik, mendukung runtime polymorphism, dan memungkinkan pengembangan kode lebih fleksibel tanpa mengubah kode superclass.

# STEPS
Abstract
1. Membuat 3 Interface : BisaDiminum, Menyegarkan, Berenergi
2. Membuat 3 class abstract : Minuman, MinumanSehat, dan MinumanTidakSehat
4. Membuat class extends : SusuSapi extends MinumaSehat
5. Membuat class implements : Kopi extends MinumanTidakSehat implements dari 3 interface tadi

Overload & Override
1. Membuat class induk : Kendaraan
2. Membuat overload
3. Membuat class turunan : Mobil
4. Membuat override dari kelas atas
