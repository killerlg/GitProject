package Controller;

import Model.Note;
import Service.NoteMethodImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    private NoteMethodImpl noteMethod = new NoteMethodImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreatPage(request,response);
                break;
            case "read":
                showReadPage(request,response);
                break;
            case "update":
                showUpdatePage(request,response);
                break;
            case "delete":
                showDeletePage(request,response);
                break;
            default:
                displayNote(request, response);
                break;
        }
    }

    private void displayNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Note> noteList = noteMethod.getAllNote();
        request.setAttribute("noteList",noteList);
        request.getRequestDispatcher("note/home.jsp").forward(request,response);
    }

    private void showCreatPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("note/create.jsp").forward(request,response);
    }

    private void showReadPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Note note = noteMethod.getNodeById(id);
        request.setAttribute("note",note);
        request.getRequestDispatcher("note/read.jsp").forward(request,response);
    }

    private void showUpdatePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Note note = noteMethod.getNodeById(id);
        request.getRequestDispatcher("note/update.jsp").forward(request,response);
    }

    private void showDeletePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Note note = noteMethod.getNodeById(id);
        request.setAttribute("note",note);
        request.getRequestDispatcher("note/delete.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                creatNote(request,response);
                break;
            case "read":
                readNote(request,response);
                break;
            case "update":
                updateNode(request,response);
                break;
            case "delete":
                deleteNote(request,response);
                break;
            case "search":
                searchNote(request,response);
                break;
            default:
                break;
        }
    }

    private void searchNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        List<Note> noteList = noteMethod.searchNote(keyword);
        request.setAttribute("noteList", noteList);
        request.getRequestDispatcher("note/home.jsp").forward(request,response);
    }

    private void creatNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Note note = new Note(title,content);
        boolean inserted = noteMethod.insertNote(note);
        if (inserted) {
            request.setAttribute("message", "Insert Succesfully!");
        } else {
            request.setAttribute("message", "Insert Fail!");
        }
        request.getRequestDispatcher("note/create.jsp").forward(request,response);
    }

    private void readNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Note note = noteMethod.getNodeById(id);
        request.setAttribute("note",note);
        request.getRequestDispatcher("note/read.jsp").forward(request,response);
    }

    private void updateNode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        Note note = new Note(Integer.parseInt(id),title,content);
        boolean updated = noteMethod.updateNote(note);
        if (updated) {
            request.setAttribute("message", "Update Succesfully!");
        } else {
            request.setAttribute("message", "Update Fail!");
        }
        request.getRequestDispatcher("note/update.jsp").forward(request,response);
    }

    private void deleteNote(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        boolean deleted = noteMethod.deleteNoteById(id);
        if (deleted) {
            request.setAttribute("message", "Delete Succesfully!");
        } else {
            request.setAttribute("message", "Delete Fail!");
        }
        List<Note> noteList = noteMethod.getAllNote();
        request.setAttribute("noteList", noteList);
        request.getRequestDispatcher("note/home.jsp").forward(request,response);
    }


}
