import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    
    @PostMapping
    public Pessoa addPessoa(@RequestBody Pessoa pessoa) {
    }
    
    @GetMapping("/{id}")
    public Pessoa getPessoa(@PathVariable Long id) {
    }
    
    @PutMapping("/{id}")
    public Pessoa updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoa) {
    }
    
    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable Long id) {
    }
}
