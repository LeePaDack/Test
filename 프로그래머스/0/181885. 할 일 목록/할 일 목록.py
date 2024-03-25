def solution(todo_list, finished):
    unfinished_tasks = []
    for i in range(len(todo_list)):
        if not finished[i]:
            unfinished_tasks.append(todo_list[i])
    return unfinished_tasks
