-- Sintaxe para ciração do Database
create database itau;

-- Sintaxe para por em uso o Database
use itau;

-- Sintaxe utilizada pra construção da tabela
create table itau.clientes(
codigo_cliente integer not null primary key,
nome varchar(50) not null,
idade integer not null,
email varchar(80) not null);

-- Sintaxe utilizada para ver a estrutura da nossa tabela
describe itau.clientes; 
-- ou
desc clientes;

-- Sintaxe utilizada para inserção de registros na tabela
insert into itau.clientes(
codigo_cliente,nome,idade,email
)
values(
1,"Renato Lima",41,"renatoplima@renatoplima.com.br"
);

insert into itau.clientes(
codigo_cliente,nome,idade,email
)
values
(2,"Ricardo Bontempo",45,"ricardo.bontempo@gama.com.br"),
(3,"Ronaldo Oliveira",20,"ronaldo@itau-unibanco.com.br"),
(4,"Luis Felipe",30,"luis.felipe@itau-unibanco.com.br");

-- insert into itau.clientes(codigo_cliente,nome,idade,email)values(45,"ricardo.bontempo@gama.com.br",2,"Ricardo Bontempo");
-- delete from itau.clientes where codigo_cliente=45;

-- Sintaxe para visualizar os registros da tabela
select * from clientes;
select codigo_cliente,nome,idade,email from clientes;

-- Site para gerar conteúdo de banco para teste http://generatedata.com/


-- Gerando massa de dados no banco

INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (5,"Hilary Boyer",24,"Nunc.ullamcorper@feugiattelluslorem.net"),(6,"Rosalyn Eaton",62,"nisi.nibh@urnaUt.co.uk"),(7,"Jasper Noble",100,"ac.mattis@velitPellentesque.com"),(8,"Zelenia Z. Bonner",71,"ipsum.ac.mi@enimSuspendissealiquet.edu"),(9,"Hiram Wall",26,"Suspendisse.aliquet.sem@scelerisqueneque.net"),(10,"Walter Lawson",39,"eu.arcu.Morbi@Suspendissealiquet.com"),(11,"Martha Hickman",88,"libero.Integer@Donecegestas.co.uk"),(12,"Byron Hunter",71,"nec@antedictum.edu"),(13,"Fatima Stanley",62,"mus.Proin.vel@eu.net"),(14,"Castor Landry",88,"aliquet.magna@vel.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (15,"Jessamine Z. Bates",72,"velit@orcilacus.ca"),(16,"Ishmael Nielsen",32,"Nullam.scelerisque@vestibulumneque.com"),(17,"Stephanie K. Price",29,"nec@dignissimMaecenasornare.net"),(18,"Dane N. Fleming",47,"rhoncus@urnaUt.ca"),(19,"Orson David",66,"pellentesque.tellus@pellentesqueSed.co.uk"),(20,"Harding S. Yang",27,"in@Sedeget.co.uk"),(21,"Ginger Rosario",73,"iaculis@sodalesatvelit.com"),(22,"Chaim L. Ashley",25,"In.ornare.sagittis@scelerisquelorem.ca"),(23,"Fulton H. Armstrong",25,"et@nonante.ca"),(24,"Chelsea Rollins",57,"ligula@sitametdiam.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (25,"Benedict Nolan",48,"sed.sem@auctorvelit.ca"),(26,"Hayley A. Wright",49,"Duis@sitamet.ca"),(27,"Adrienne R. Decker",27,"sit.amet@estarcu.com"),(28,"Leila C. Stevenson",18,"lacinia.orci@tempusrisusDonec.co.uk"),(29,"Giacomo Banks",87,"vel@aliquameros.co.uk"),(30,"Shelby Zamora",83,"id@Vestibulumuteros.com"),(31,"Zane Z. Morse",47,"ac.ipsum.Phasellus@id.ca"),(32,"Wanda F. Wilson",52,"aliquet.diam.Sed@idmagnaet.edu"),(33,"Quamar S. Black",66,"faucibus.orci@facilisis.com"),(34,"Octavia Cohen",68,"erat.eget.tincidunt@eu.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (35,"Jane H. Molina",64,"sit.amet.consectetuer@sodaleselit.com"),(36,"Aurelia Carr",48,"lorem.sit@etcommodoat.ca"),(37,"Hector T. Griffin",43,"orci@ultricesaauctor.ca"),(38,"Kaseem U. Hodge",50,"enim@rutrumFusce.com"),(39,"Mufutau K. Owens",81,"Proin@intempus.edu"),(40,"Jessamine Daugherty",93,"erat@Phasellus.net"),(41,"Olympia Rhodes",39,"ac.urna.Ut@Nuncmaurissapien.co.uk"),(42,"Cooper Carlson",57,"ornare@lacus.com"),(43,"Iona K. Franks",28,"per@fringillaporttitor.net"),(44,"Noelani Steele",84,"blandit.viverra@pedeacurna.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (45,"Lavinia Santana",53,"vitae.risus.Duis@felis.com"),(46,"Allistair Robertson",71,"justo.eu.arcu@lacinia.edu"),(47,"Raya P. Powell",76,"Nunc@Suspendissetristiqueneque.com"),(48,"Chastity T. Ferguson",99,"imperdiet@pedenonummy.org"),(49,"Alice X. Barlow",34,"elementum.purus.accumsan@molestie.co.uk"),(50,"Cherokee Gutierrez",95,"odio.a.purus@vitaedolor.co.uk"),(51,"Jakeem Z. Spence",91,"viverra.Donec@Duisami.ca"),(52,"Katell Y. Vasquez",19,"nisi.Mauris.nulla@primisin.ca"),(53,"Timothy T. Barrett",57,"est@primisinfaucibus.net"),(54,"Julian Huffman",26,"eu.enim.Etiam@loremeu.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (55,"Cathleen Suarez",68,"Proin.ultrices@dui.edu"),(56,"Kameko Bean",63,"eget@ultrices.org"),(57,"Tatum S. Phelps",31,"nulla@primis.org"),(58,"Quamar P. Dale",90,"et.rutrum@Fusce.co.uk"),(59,"Deanna Cardenas",79,"augue@idsapienCras.net"),(60,"Brandon L. Yang",77,"lectus@fermentum.com"),(61,"Sybill Garcia",61,"eu@eleifend.co.uk"),(62,"Josephine Tran",99,"blandit.congue.In@euarcu.org"),(63,"James Silva",42,"semper.auctor.Mauris@sapienNuncpulvinar.edu"),(64,"Griffith I. Osborne",19,"lorem@massalobortis.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (65,"Jena L. Hendrix",91,"cursus@egetvenenatisa.ca"),(66,"Rina T. Pate",89,"pede@lobortis.edu"),(67,"Elizabeth Z. Burgess",63,"magna.et.ipsum@sapienimperdiet.ca"),(68,"Brady V. Hutchinson",98,"arcu@dictum.co.uk"),(69,"Desiree Parker",85,"lacus@dictum.edu"),(70,"Freya S. Johnston",80,"vitae.sodales@adipiscingenim.com"),(71,"Christine Z. Mcclure",96,"augue.eu.tempor@tempor.edu"),(72,"Damon Chase",72,"dictum.magna.Ut@Proinvel.net"),(73,"Amos T. Hobbs",94,"Cras.eu.tellus@nonquam.net"),(74,"Quyn Koch",23,"scelerisque.mollis@Proinvel.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (75,"Lacy F. Hutchinson",81,"elit.elit@aliquetPhasellusfermentum.ca"),(76,"Oscar Clarke",97,"non.massa@vitaesodalesat.org"),(77,"Brock Mendez",45,"luctus.et@luctusipsumleo.com"),(78,"Caldwell Dixon",50,"tellus.Phasellus@duinec.ca"),(79,"Garrett X. Randolph",19,"urna.suscipit.nonummy@et.com"),(80,"Colette Wilson",45,"dolor.Fusce.mi@ac.ca"),(81,"Lisandra Morrow",30,"et.risus@Namconsequat.co.uk"),(82,"Beverly Patel",33,"justo.Praesent@porttitorvulputate.org"),(83,"Kyle Burton",68,"erat.Sed@nonlobortisquis.com"),(84,"Buffy Wheeler",29,"quis.pede@idrisusquis.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (85,"Martena Acosta",50,"non.sapien@In.edu"),(86,"Kathleen Q. Lang",31,"sed@tempus.ca"),(87,"Flynn Ayala",73,"a@eget.edu"),(88,"Daphne Z. Suarez",66,"elit.Nulla.facilisi@faucibus.edu"),(89,"Orson P. Edwards",80,"non@et.com"),(90,"Keefe Dixon",26,"sit@felispurus.net"),(91,"Reed Stevens",42,"arcu@erateget.net"),(92,"Graiden Warren",32,"Etiam@parturientmontes.ca"),(93,"Lamar Drake",95,"blandit@musAeneaneget.ca"),(94,"Rose G. Barker",49,"Aliquam.adipiscing.lobortis@sagittislobortis.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome`,`idade`,`email`) VALUES (95,"Berk Christian",84,"magna.a@ullamcorperviverraMaecenas.net"),(96,"Luke Tillman",26,"lobortis.quam.a@Maurisvelturpis.com"),(97,"Declan Bates",57,"condimentum.eget@nuncullamcorpereu.org"),(98,"Britanney C. Mckee",72,"euismod@ametdiameu.edu"),(99,"Ariel Cervantes",81,"posuere@commodoatlibero.edu"),(100,"Vera M. Mayer",93,"et.ultrices@diamvelarcu.net"),(101,"Vernon Gallegos",77,"adipiscing@lectusantedictum.edu"),(102,"Zachery Abbott",48,"lorem.ac.risus@Etiamligulatortor.co.uk"),(103,"Patrick Santana",91,"egestas@ultriciesdignissim.ca"),(104,"Charity X. Macias",43,"mauris.ipsum@Donec.com");
