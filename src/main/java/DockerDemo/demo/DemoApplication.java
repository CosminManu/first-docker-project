package DockerDemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

//#face display tutoror imaginilor de docker aduse
//		docker images
//
//		#face display de containere
//		docker ps -a
//
//		#sterge o imagine
//		docker rmi <id_imagine>
//
//#sterge un container
//		docker rm <id_container>
//
//#opreste un container
//		docker stop <id_cont>
//
//#sterge o imagine ce are o instanta activa
//		docker rmi -f <id_imagine>
//
//#creaza o imagine pe baza fisierului Dockerfile aflat in directorul curent
//		docker build -t stefan/awesome:1.0-SNAPASHOT .
//
//		#creeaza o instanta/container a unei imagini de docker deja salvata la noi
//		docker run -d -p 8081:8080 cosmin/awesome:1.0-SNAPSHOT
