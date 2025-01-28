import time
import sys

def animate_saving():
    """Animate a 'Saving >>>>>>>>>>>>>>>>>>' effect."""
    print("\nSaving", end="")
    for _ in range(20):
        sys.stdout.write(">")
        sys.stdout.flush()
        time.sleep(0.01)
    print("\nSaved successfully!\n")

def get_valid_string(prompt):
    """Ensure the input is a valid string (text-only)."""
    while True:
        value = input(prompt)
        if value.replace(" ", "").isalpha():
            return value
        print("Invalid input! Please enter text only.")

def get_valid_float(prompt):
    """Ensure the input is a valid float (numeric value)."""
    while True:
        try:
            value = float(input(prompt))
            return value
        except ValueError:
            print("Invalid input! Please enter a numeric value (decimals are allowed).")

def get_valid_pass_mark(prompt):
    """Ensure the input is a valid numeric value between 1 and 99."""
    while True:
        try:
            value = float(input(prompt))
            if 1 <= value <= 99:
                return value
            print("Invalid input! The pass mark must be a number between 1 and 99.")
        except ValueError:
            print("Invalid input! Please enter a numeric value.")

def main():
    print("Welcome to the Student Grade Management System!")

    # Step 1: Input number of students and subjects
    num_students = int(get_valid_float("Enter the number of students: "))
    num_subjects = int(get_valid_float("Enter the number of subjects: "))
    animate_saving()

    # Step 2: Initialize data structures
    student_names = []
    subject_names = []
    pass_marks = []
    scores = []

    # Step 3: Input student names
    print("\nEnter the names of the students:")
    for i in range(num_students):
        name = get_valid_string(f"Student {i + 1} name: ")
        student_names.append(name)
    animate_saving()

    # Step 4: Input subject names and pass marks
    print("\nEnter the names of the subjects and their pass marks:")
    for i in range(num_subjects):
        subject = get_valid_string(f"Subject {i + 1} name: ")
        pass_mark = get_valid_pass_mark(f"Pass mark for {subject} (1-99): ")
        subject_names.append(subject)
        pass_marks.append(pass_mark)
    animate_saving()

    # Step 5: Collect scores for each student in each subject
    print("\nEnter the scores for each student in each subject:")
    for i in range(num_students):
        print(f"\nScores for {student_names[i]}:")
        student_scores = []
        for j in range(num_subjects):
            while True:
                score = get_valid_float(f"  {subject_names[j]} score (0-100): ")
                if 0 <= score <= 100:
                    break
                print("Invalid score! Please enter a score between 0 and 100.")
            student_scores.append(score)
        scores.append(student_scores)
    animate_saving()

    # Step 6: Calculate total and average scores and positions
    total_scores = [sum(student_scores) for student_scores in scores]
    average_scores = [total / num_subjects for total in total_scores]
    sorted_indices = sorted(range(num_students), key=lambda i: -average_scores[i])
    positions = [sorted_indices.index(i) + 1 for i in range(num_students)]

    # Step 7: Display the student score table
    print("\nSTUDENT SCORES TABLE")
    print(f"{'Student':<15}", end="")
    for subject in subject_names:
        print(f"{subject:<10}", end="")
    print(f"{'Total':<10}{'Average':<10}{'Position':<10}")
    for i in range(num_students):
        print(f"{student_names[i]:<15}", end="")
        for score in scores[i]:
            print(f"{score:<10.2f}", end="")
        print(f"{total_scores[i]:<10.2f}{average_scores[i]:<10.2f}{positions[i]:<10}")

    # Step 8: Subject summary
    print("\nSUBJECT SUMMARY")
    for j in range(num_subjects):
        subject_scores = [scores[i][j] for i in range(num_students)]
        highest_score = max(subject_scores)
        lowest_score = min(subject_scores)
        highest_student = student_names[subject_scores.index(highest_score)]
        lowest_student = student_names[subject_scores.index(lowest_score)]
        total_subject_score = sum(subject_scores)
        avg_subject_score = total_subject_score / num_students
        passes = len([score for score in subject_scores if score >= pass_marks[j]])
        fails = len([score for score in subject_scores if score < pass_marks[j]])

        print(f"\n{subject_names[j]}:")
        print(f"  Highest Scoring Student: {highest_student} scoring {highest_score:.2f}")
        print(f"  Lowest Scoring Student: {lowest_student} scoring {lowest_score:.2f}")
        print(f"  Total Score: {total_subject_score:.2f}")
        print(f"  Average Score: {avg_subject_score:.2f}")
        print(f"  Number of Passes: {passes}")
        print(f"  Number of Fails: {fails}")

    # Step 9: Hardest and easiest subjects
    subject_fails = [len([scores[i][j] for i in range(num_students) if scores[i][j] < pass_marks[j]]) for j in range(num_subjects)]
    if max(subject_fails) > 0:
        hardest_subject = subject_names[subject_fails.index(max(subject_fails))]
        easiest_subject = subject_names[subject_fails.index(min(subject_fails))]
    else:
        subject_totals = [sum([scores[i][j] for i in range(num_students)]) for j in range(num_subjects)]
        hardest_subject = subject_names[subject_totals.index(min(subject_totals))]
        easiest_subject = subject_names[subject_totals.index(max(subject_totals))]

    print("\nHARD AND EASY SUBJECTS")
    print(f"  Hardest Subject: {hardest_subject} with {max(subject_fails)} fails")
    print(f"  Easiest Subject: {easiest_subject} with {min(subject_fails)} passes")

    # Step 10: Overall highest and lowest scores
    print("\nOVERALL SCORES")
    for j in range(num_subjects):
        subject_scores = [scores[i][j] for i in range(num_students)]
        highest_score = max(subject_scores)
        lowest_score = min(subject_scores)
        highest_student = student_names[subject_scores.index(highest_score)]
        lowest_student = student_names[subject_scores.index(lowest_score)]

        print(f"{subject_names[j]}:")
        print(f"  Overall Highest Score: {highest_student} scoring {highest_score:.2f}")
        print(f"  Overall Lowest Score: {lowest_student} scoring {lowest_score:.2f}")

    # Step 11: Class summary
    best_student = student_names[total_scores.index(max(total_scores))]
    worst_student = student_names[total_scores.index(min(total_scores))]
    class_total_score = sum(total_scores)
    class_average_score = class_total_score / (num_students * num_subjects)

    print("\nCLASS SUMMARY")
    print(f"  Best Graduating Student: {best_student} scoring {max(total_scores):.2f}")
    print(f"  Worst Graduating Student: {worst_student} scoring {min(total_scores):.2f}")
    print(f"  Class Total Score: {class_total_score:.2f}")
    print(f"  Class Average Score: {class_average_score:.2f}")

if __name__ == "__main__":
    main()