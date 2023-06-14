# App
- berisi method main untuk menjalankan aplikasi/program
- method Menu.showMenu() untuk menampilkan method showMenu() pada kelas Menu

##Package config
# file MyConfig
- pada kelas MyConfig terdapat 3 variabel yang nilainya tidak bisa diubah,
yaitu DB_URL, DB_USER, dan DB_PASS. pada kelas ini digunakan untuk mengatur koneksi ke database MySQL

##Package control
# file DbControl
- kelas MyConfig diextends dengan kelas DbControl pada file ini. Kelas ini berfungsi 
untuk mengontrol akses tabel "tb_produk" pada database. 
- terdapat method getDatabase() untuk mengambil data dari tb_produk dan method readDB() untuk menampilkannya
- method insertDB() untuk memasukkan/membuat data baru ke dalam tabel tb_produk
- method updateNamaDB(), method updateHargaDB(), method updateStokDB() untuk mengupdate data pada tabel berdasarkan ID
- method deletDB() untuk menghapus data dari tabel berdasarkan nama produk
- method getProdukbyNama() untuk mendapat data prduk berdasarkan nama produk

##Package layouts
# file DeleteData
- file ini berisi kode untuk menghapus data dari database. method showDeleteData() akan menampilkan data yang akan dihapus.
- if-else digunakan untuk memeriksa apakah berhasil tidaknya dalam pemanggilan method deletDB(nama) dari kelas DbControl dalam menghapus data

# file InsertData
- file ini berisi kode untuk memasukkan/menambah data produk pada database. method showInsertData() akan menampilkan data produk yang akan dimasukkan/ditambahkan ke database
- method DbControl.insertDB() dipanggil untuk memasukkan/menambahkan data produk ke dalam database

# file Menu
- file ini berisi kode yang menampilkan menu aplikasi "Coffee Shop". method showMenu() akan menampilkan menu data dari "Coffee Shop"
- method selectMenu() untuk membaca menu apa yang akan dipilih user dan memilih tindakan sesuai dengan pilihan menu yang dimasukkan

# file ReadData
- file ini berisi kode yang menampilkan data produk dan menu menggunakan Scanner
- switch case digunakan untuk menentukan tindakan yang dilakukan berdasarkan inputan user, jika memilih 1 method showMenu() dari kelas Menu akan berjalan dan jika memilih 2 System.exit() akan berjalan dan mencetak pesan "SAMPAI JUMPA".
- jika yang dipilih adalah nomor selain 1 dan 2, akan mencetak pesan "MAAF MENU YANG DIPILIH TIDAK TERSEDIA" dan method showReadData() akan berjalan menampilkan ulang data dan opsi menu

# file UpdateData
- file ini berisi kode yang akan mengupdate data produk dalam aplikasi
- method showUpdateData(String nama) menampilkan menu untuk memilih produk yang ingin diubah
- setelah memilih produk, method showEditNama(), showEditHarga(), showEditStok() akan terpanggil tergantung dengan inputan dan method showUpdateData() akan menampilkan informasi dari produk yg dipilih dan meminta user untuk memasukkan data yang telah diupdate/baru

##Package models
# file Produk
- file ini untuk merepresentasikan Produk dalam sebuah program
- terdapat 4 atribut pada kelas Produk yaitu id, nama, harga, dan stok
- terdapat constructor untuk menerima nilai id, nama, harga, dan stok
- dan terdapat method setter dan getter untuk semua atribut yang digunakan untuk mengaskes dan mengubah nilai variabel instance produk