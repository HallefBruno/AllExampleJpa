package com.all.exemples.jpa;

import com.all.exemples.jpa.v2.impl.onetomany.BookServiceImpl;
import com.all.exemples.jpa.v2.model.onetomany.v1.Book;
import com.all.exemples.jpa.v2.model.onetomany.v1.Story;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllExampleJpaApplication implements CommandLineRunner {
    
    @Autowired
    BookServiceImpl bookServiceImpl;
    
    public static void main(String[] args) {
        SpringApplication.run(AllExampleJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        
        Book book = new Book();
        book.setBookName("Anatomia do Estado");
        
        Story story1 = new Story();
        Story story2 = new Story();
        
        story1.setStoryName("Comecei a ler");
        story1.setBook(book);
        story2.setStoryName("Estou gostando");
        story2.setBook(book);
        
        book.setStory(List.of(story1,story2));
        
        bookServiceImpl.save(book);

        
//        ArquivoCadastro arquivoCadastro1 = new ArquivoCadastro();
//        
//        ServicoUtilizado servicoUtilizado1 = new ServicoUtilizado();
//        ServicoUtilizado servicoUtilizado2 = new ServicoUtilizado();
//        ServicoUtilizado servicoUtilizado3 = new ServicoUtilizado();
//        ServicoUtilizado servicoUtilizado4 = new ServicoUtilizado();
//        
//        servicoUtilizado1.setTipoServico("CADASTRO");
//        servicoUtilizado2.setTipoServico("REMOCAO");
//        servicoUtilizado3.setTipoServico("UPDATE");
//        servicoUtilizado4.setTipoServico("LIST");
//        
//        List<ServicoUtilizado> servicoUtilizados1 = new ArrayList<>();
//        
//        arquivoCadastro1.setCpfCnpj("12345678912");
//        arquivoCadastro1.setDocumento("CPF");
//        
//        servicoUtilizado1.setArquivoCadastro(arquivoCadastro1);
//        servicoUtilizado2.setArquivoCadastro(arquivoCadastro1);
//        servicoUtilizado3.setArquivoCadastro(arquivoCadastro1);
//        servicoUtilizado4.setArquivoCadastro(arquivoCadastro1);
//        
//        servicoUtilizados1.add(servicoUtilizado1);
//        servicoUtilizados1.add(servicoUtilizado2);
//        servicoUtilizados1.add(servicoUtilizado3);
//        servicoUtilizados1.add(servicoUtilizado4);
//        
//        arquivoCadastro1.setServicosUtilizados(servicoUtilizados1);
//        
//        arquivoCadastroService.salvar(arquivoCadastro1);
//        servicoUtilizadoService.salvar(servicoUtilizados1);
        
//        UserOne user = new UserOne("Hallef", "brunohallef@email.com");
//        user = userService.salvar(user);
//        Post post = new Post("Assunto", user);
//        List<Comment> comments = List.of(new Comment("Ok",post, user));
//        post.setComments(comments);
//        postService.salvar(post);
//        
//        
//        for(Post p : postService.todos()) {
//            System.out.println(p.getUserOne().getEmail());
//        }

    }

}
