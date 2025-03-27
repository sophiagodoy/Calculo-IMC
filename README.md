# 💖 Sobre o Projeto

Este é um **app Android** desenvolvido utilizando o **Firebase** e o **Android Studio**, onde os dados dos usuários são armazenados diretamente no **banco de dados Firestore** do Firebase. Foi a minha primeira experiência integrando o Android com o Firebase e o Firestore, o que me permitiu aprender a conectar o app Android ao banco de dados em tempo real.

O objetivo principal do projeto é **armazenar dados** de forma eficiente e segura no Firebase, garantindo que as informações dos usuários sejam salvas remotamente e possam ser acessadas de qualquer lugar.

---

# 🛠️ Passo a Passo para Rodar o Projeto com Firebase

## 1️⃣ Passo 1: Clonar o Repositório no GitHub

1. **Clonar o repositório**
   - Copie a URL do repositório no GitHub.
   - No terminal, navegue até o diretório onde deseja armazenar o projeto e execute o seguinte comando:

     ```gradle
     git clone https://github.com/sophiagodoy/calculo-imc.git
     ```

## 2️⃣ Passo 2: Criar um Projeto no Firebase

1. **Acesse o Firebase Console**
   - Vá até o [Firebase Console](https://console.firebase.google.com/).

2. **Criar um novo projeto**
   - No Firebase Console, clique em **Adicionar Projeto**.
   - Siga os passos para criar um novo projeto:
     - Dê um nome para o projeto.
     - Selecione o país/região.
     - Aceite os termos e condições.
     - Se necessário, configure o Google Analytics para o seu projeto (opcional).

3. **Finalizar criação do projeto**
   - Após preencher as informações, clique em **Criar Projeto**.
   - O Firebase irá criar o seu projeto e redirecioná-lo para a página principal do projeto.

## 3️⃣ Passo 3: Criar um Banco de Dados Firestore

1. **Ativar o Firestore**
   - Dentro do seu projeto no **Firebase Console**, navegue até a seção **Firestore Database**.
   - Clique em **Criar Banco de Dados**.

2. **Configurar o Firestore**
   - Após clicar em **Criar Banco de Dados**, você será guiado por um assistente para configurar o Firestore.
   - Selecione o modo de segurança para o Firestore:
     - **Modo de produção**: Recomendado se você já tem um app funcionando e deseja configurar regras de segurança.
     - **Modo de teste**: Usado enquanto você desenvolve e testa o app, mas não é recomendado para produção.
   - Escolha a **localização** do banco de dados (geralmente, você pode selecionar a opção padrão).
   
3. **Finalizar a configuração**
   - Clique em **Ativar** para finalizar a criação do banco de dados Firestore.
   - Após a criação, você poderá visualizar o banco de dados e começar a adicionar coleções e documentos.

## 4️⃣ Passo 4: Vincular o App Android ao Firebase

### Adicionar o Firebase ao Projeto Android

1. **Acesse o Firebase Console**
   - No Firebase Console, vá para **Configurações do Projeto > Geral**.

2. **Adicionar o Firebase ao seu App Android**
   - Selecione **Android**.
   - Siga os passos fornecidos para adicionar o Firebase ao seu app Android:
     - Baixe o arquivo **`google-services.json`**.
     - Coloque o arquivo **`google-services.json`** na pasta **`app/`** do seu projeto Android.

### Configurar as dependências do Firebase no Android Studio

1. **Abrir o projeto no Android Studio**
   - Abra o projeto clonado no Android Studio.

2. **Verificar as dependências no `build.gradle` (nível de app)**
   - No arquivo **`build.gradle`** (nível de app), verifique se as dependências do Firebase estão corretas.

3. **Sincronizar o projeto com o Gradle**
   - Após adicionar ou verificar as dependências, vá para **File > Sync Project with Gradle Files** no Android Studio para sincronizar o projeto.

## 5️⃣ Passo 5: Rodar o Projeto no Android Studio

1. No Android Studio, clique no botão **Run** (ícone de play) para compilar e executar o aplicativo no dispositivo ou emulador selecionado.

---

## 6️⃣ Passo 6: Verificar Dados no Firebase

### Verificar no Firebase Console

1. Após rodar o app, vá até a seção **Firestore Database** no **Firebase Console**.
2. Verifique se os dados estão sendo salvos corretamente no banco de dados do Firebase:
   - Você poderá ver as coleções e documentos criados pelo seu app.

---

## 💡 Observações Importantes

- **Certifique-se de que o arquivo `google-services.json`** está corretamente configurado e está na pasta **`app/`** do seu projeto.
- **Verifique se as dependências do Firebase** no seu arquivo **`build.gradle`** estão corretas.
- Caso encontre algum erro de sincronização ou autenticação, verifique as configurações no **Firebase Console** e no **Android Studio** para garantir que tudo esteja vinculado corretamente.
