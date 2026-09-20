
# Tugas Pemrograman Berorientasi Objek 
| Keterangan | Data |
|---|---|
| Nama | Fariz Aufarizky |
| NIM | 2509116004 |
| Kelas | A 25 Sistem Informasi |
| Judul | Manajemen Klinik Gigi |
<br>

# 1. Penjelasan Studi Kasus<br>
Program ini digunakan untuk membantu mengelola data pasien dan dokter pada sebuah klinik gigi. Data dokter sudah tersedia di dalam program, sedangkan pasien dapat melakukan pendaftaran dengan memasukkan data diri dan keluhan.<br>
Setelah pasien terdaftar, Manager dapat menentukan dokter yang akan menangani pasien berdasarkan data dan keluhan pasien.<br>
Program dibuat menggunakan Java dan dijalankan melalui Command Line Interface (CLI).<br>

Fitur Program<br>
• Mendaftarkan pasien.<br>
• Menampilkan data pasien.<br>
• Menampilkan daftar dokter.<br>
• Manager menentukan dokter untuk pasien.<br>
• Menampilkan informasi klinik.<br>
• Keluar dari program.<br>

# 2. Diagram Class
<img width="359" height="476" alt="Screenshot 2026-09-20 180555" src="https://github.com/user-attachments/assets/c259abec-8377-46b9-be96-4500196b7f52" /><br>
<img width="272" height="224" alt="Screenshot 2026-09-20 180633" src="https://github.com/user-attachments/assets/79ad9e1f-72c0-4cdc-abe1-73fee09b6a1a" /><br>

### Penjelasan Hierarki Class
• Manager merupakan superclass atau class induk Manager merupakan superclass atau class induk karena digunakan sebagai tempat menyimpan data dan method dasar yang dapat diwariskan kepada class Dokter, seperti ID, nama, nomor telepon, dan tampilkanInfo().<br>
• Dokter merupakan subclass yang mewarisi atribut dan method dari Manager.<br>
• Pasien digunakan untuk menyimpan data pasien.<br>
• Dental klinik sebagai class main merupakan class utama yang menjalankan program dan mengatur menu.<br>
• DentalKlinik digunakan untuk mengelola data pasien dan dokter selama program berjalan.<br>

# 3. Penerapan Inheritance
Pada program ini, class Manager digunakan sebagai superclass karena memiliki beberapa data dasar yang juga dibutuhkan oleh class Dokter, yaitu ID, nama, dan nomor telepon. Dengan menjadikan Manager sebagai superclass, data dan method tersebut tidak perlu dibuat ulang di dalam class Dokter.
Class Dokter kemudian menggunakan keyword extends untuk mewarisi atribut dan method dari Manager.<br>
<img width="408" height="136" alt="Screenshot 2026-09-20 181334" src="https://github.com/user-attachments/assets/ff97f8e3-8d0a-40a2-b10d-dcfdc60a8683" /><br>

Pada bagian kode ini<br>
<img width="1170" height="185" alt="IMG_20260920_210510" src="https://github.com/user-attachments/assets/dd893af8-6202-4445-bda2-fec34a1f3438" /><br>
Menunjukkan bahwa Dokter merupakan subclass dari Manager. Artinya, objek Dokter dapat menggunakan data dan method yang dimiliki oleh Manager.<br>

Sedangkan:
<img width="1417" height="212" alt="IMG_20260920_210953" src="https://github.com/user-attachments/assets/9afde5b5-04f1-45e1-b1a3-08326170b5a7" /><br>
Atribut spesialisasi digunakan untuk menyimpan bidang dokter, misalnya Dokter Gigi Umum, Spesialis Ortodonti, atau Spesialis Gigi Anak.<br>

<img width="1457" height="219" alt="IMG_20260920_211243" src="https://github.com/user-attachments/assets/edf2c7f7-15c1-4883-af61-3e5f0d62825b" /><br>
Digunakan untuk memanggil constructor milik superclass Manager sehingga data dasar seperti ID, nama, dan nomor telepon dapat diisi melalui constructor tersebut.<br>

# 4. Struktur Class
Manajemen-Klinik-Gigi<br>
│<br>
├── Manager.java<br>
├── Dokter.java<br>
├── Pasien.java<br>
└── Main.java<br>
### Fungsi Masing-Masing Class
• Manager.java
Digunakan sebagai superclass yang menyimpan data dasar seperti ID, nama, dan nomor telepon. Class ini juga memiliki method yang dapat digunakan oleh class turunannya.<br>
• Dokter.java
Digunakan untuk menyimpan data dokter seperti ID, nama, nomor telepon, dan spesialisasi. Class ini mewarisi data dan method dari Manager.<br>
• Pasien.java
Digunakan untuk menyimpan data pasien seperti ID pasien, nama, umur, nomor telepon, keluhan, serta dokter yang menangani pasien.<br>
• Main.java
Merupakan class utama untuk menjalankan program. Class ini menampilkan menu, menerima input dari pengguna, dan mengatur proses pendaftaran pasien serta penentuan dokter.<br>

# 5. Running Program
### Tampilan Awal
<img width="266" height="149" alt="Screenshot 2026-09-20 182348" src="https://github.com/user-attachments/assets/8df04614-9302-497f-8c2b-61dcdd56d0b6" /><br>
Menampilkan menu utama yang dapat digunakan untuk menjalankan fitur aplikasi.<br>

### 1. Pendaftaran Pasien
<img width="321" height="132" alt="Screenshot 2026-09-20 182722" src="https://github.com/user-attachments/assets/d3a62e27-f75e-405b-8a62-a317b13f93ad" /><br>
Menampilkan proses pendaftaran pasien dengan memasukkan data diri dan keluhan.<br>

### 2. Daftar Pasien
<img width="270" height="157" alt="Screenshot 2026-09-20 182829" src="https://github.com/user-attachments/assets/ed0117d7-d480-44f2-ac2b-025aef0c974d" /><br>
Menampilkan daftar pasien yang sudah melakukan pendaftaran dimenu pertama.<br>

### 3. Daftar Dokter 
<img width="407" height="344" alt="Screenshot 2026-09-20 182932" src="https://github.com/user-attachments/assets/69a5f261-32f3-4e80-beaf-109f7bc04add" /><br>
Menampilkan daftar dokter yang sudah tersedia di dalam program.<br>

### 4. Manager Menentukan Dokter
<img width="377" height="341" alt="Screenshot 2026-09-20 183858" src="https://github.com/user-attachments/assets/49f4e596-2683-418a-9039-e141e8d4bd50" /><br>
Menampilkan proses Manager menentukan dokter yang akan menangani pasien.<br>

### 5. Informasi Klinik
<img width="359" height="112" alt="Screenshot 2026-09-20 183955" src="https://github.com/user-attachments/assets/91c5731c-e9d2-4dcb-af80-4fffb48a0076" /><br>
Menampilkan jumlah dokter dan pasien yang sudah terdaftar didalamnya.<br>

### 6. Keluar
<img width="476" height="91" alt="Screenshot 2026-09-20 184055" src="https://github.com/user-attachments/assets/3e5cd4a8-ea0b-4584-950d-29f55fab198e" /><br>
Ketika sudah selesai menggunakan program bisa menggunakan menu ini.<br>





