const chatInput = document.querySelector(".chat-button button");
const chatbox = document.querySelector(".chatbox");

const createChatLi = (message, className) => {
  const chatLi = document.createElement("li");
  chatLi.classList.add("chat", `${className}`);
  let chatContent = className === "outgoing" ? `<p></p>` : `<span class="material-symbols-outlined"></span><p></p>`;
  chatLi.innerHTML = chatContent;
  chatLi.querySelector("p").textContent = message;
  return chatLi;
}

const generateResponse = (chatElement) => {
  const messageElement = chatElement.querySelector("p");
}

const handleChat = () => {
  userMessage = chatInput.value.trim();
  if (!userMessage) return;

  chatInput.value = "";
  chatInput.style.height = `${inputInitHeight}px`;
};

const questionButtons = document.querySelectorAll('.chat-button button');

questionButtons.forEach((button, index) => {
  button.addEventListener('click', () => {
    let question = '';
    let response = '';

    if (index === 0) {
      question = '지원 기간은 언제인가요?';
      response = '1월 9일까지 입니다.';
    } else if (index === 1) {
      question = '지원 방법을 알려주세요.';
      response = '위의 양식으로 이동해주세요.'
    } else if (index === 2) {
      question = '궁금증이 있어요.';
      response = '카카오톡으로 문의 바랍니다'
    }

    userMessage = question;
    handleChat();
    
    setTimeout(() => {
      const chatLi = createChatLi(question, "uncoming");
      chatbox.appendChild(chatLi);
      chatbox.scrollTo(0, chatbox.scrollHeight);
    }, 0);

    setTimeout(() => {
      const chatLi = createChatLi(response, "incoming");
      chatbox.appendChild(chatLi);
      chatbox.scrollTo(0, chatbox.scrollHeight);
    }, 500);
  });
});

const closeBtn = document.querySelector(".close-btn");
const chatbotToggler = document.querySelector(".chatbot-toggler");

closeBtn.addEventListener("click", () => document.body.classList.remove("show-chatbot"));
chatbotToggler.addEventListener("click", () => document.body.classList.toggle("show-chatbot"));