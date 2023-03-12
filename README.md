# Struktur-Data

## Praktikum Struktur Data Semester 4

## Mengunduh Repository

Unduh repository ke dalam komputer menggunakan perintah `git clone`. Url
repository dapat dilihat di dalam repository yang diinginkan.

```
git clone <url repository> <folder tujuan>
```

#### Contoh

```
git clone https://github.com/Zain5316/Struktur-Data.git Praktikum
```
atau
```
git clone https://github.com/Zain5316/Struktur-Data.git
```

## Memperbarui Repository

Perbarui repository yang telah diunduh ke dalam komputer menggunakan perintah
`git pull`.

```
git pull origin <nama branch>
```

#### Contoh

```
git pull https://github.com/Zain5316/Struktur-Data.git main
```

## Mengunggah Perubahan

Jangan lupa untuk melakukan pull terlebih dahulu sebelum melakukan push.

**Tambah file baru atau ubah file**

```
git add <nama file>
```

**Tambah beberapa file baru atau ubah beberapa file sekaligus**
```
git add .
```

**Konfirmasi penambahan atau perubahan file**

```
git commit -m "<pesan commit>"
```

**Ubah dan konfirmasi modifikasi beberapa file sekaligus**

```
git commit -a -m "<pesan commit>"
```

**Kirim perubahan ke dalam repository**

```
git push origin <nama branch>
```

#### Contoh

```
git add README.md
```
```
git commit -m "Menambahkan readme"
```
```
git push origin main
```

## Menghapus File

Hapus file dari repository menggunakan perintah `git rm`, diikuti dengan `git commit`, dan `git push`.

```
git rm <nama file>
```

#### Contoh

```
git rm README.md
```
```
git commit -m
```

## Perintah tambahan

Dapatkan status dari repository

```
git status
```

Mengecek perubahan yang belum terkonfirmasi dalam repository

```
git diff
```

Mengecek perubahan yang sudah terkonfirmasi dalam repository

```
git show
```

Dapatkan log dari sebuah repository

```
git log
```

Dapatkan hanya beberapa log terakhir dari sebuah repository (contoh: 3)

```
git log -3
```

## gitignore
Ada kalanya kita melihat file gitignore di suatu repository. Apakah itu gitignore? gitignore adalah file yang berisi instruksi kepada git repository untuk tidak men-track files tertentu. Ini sangat berguna untuk meng-exclude files yang mungkin tidak berguna atau tidak perlu di push ke repository. Contoh: .DS_Store di Mac, binary files, `__pycache__`, etc. 

File gitignore dimulai dengan titik (`.`) di Unix-based system (Mac dan Linux) untuk menandakan dia adalah hidden file. Di Windows, buat file gitignore dengan memberi nama `.gitignore`.

#### Contoh

Untrack file tertentu
```
# tagar digunakan untuk commenting
# Mac
.DS_Store

# Spreadsheet
*.xls
*.xlsx

# Compressed file
*.zip
*.rar
*.gz
```

Untrack folder tertentu
```
# tagar digunakan untuk commenting
# python
__pycache__/

# virtual environment
env/
venv/
```

Contoh koleksi gitignore yang berguna  
https://github.com/github/gitignore