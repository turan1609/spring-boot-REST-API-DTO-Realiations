package com.yusufturan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yusufturan.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	//Buralara kendi metodlarımızı yazabiliriz
	//Örneğin kendi query imizi yazmak istiyotuz
	//HQL formatında yani nativeQuery = false olduğunda değişken isimlerini kullanarak sorgu yazarsınız. Tablo ismide class ın ismidir. O yüzden Student yazıyoruz
	//Fakat nativeQuery = true olduğunda normal SQL yazarız. Değişken isimleri veritabanındaki column isimleri olur. Tablo ismide veritabanındaki tablo ismi olur.
	@Query(value = "from Student", nativeQuery = false)
	List<Student> findAllStudents();//Bu arada bu fonksiyonun işlevindeki fonksiyon JpaRepository de var ama biz @Query anatasyonunu öğrenmek için yazıyoruz
}
