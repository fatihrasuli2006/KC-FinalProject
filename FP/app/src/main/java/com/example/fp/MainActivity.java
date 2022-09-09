package com.example.fp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentStudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.changeButton);
        Button backButton = findViewById(R.id.backButton);

        ImageView studentPhotoView = findViewById(R.id.studentImageView);
        TextView studentNameView = findViewById(R.id.studentNameView);
        TextView studentDescreptionView = findViewById(R.id.studentDescreptionView);

        Intent intent = new Intent();
        String name = "fatih";
        Student s1 = new Student("البرتقال","تعزيز عملية الهضم ...\n" +
                "تقليل خطر الإصابة بسرطان المعدة ...\n" +
                "تقليل خطر الإصابة بجرثومة المعدة ...\n" +
                "تمنع اضطرابات المعدة الناجمة عن حصوات الكلى ...\n" +
                "تنظيم مستوى السكر بالدم ...\n" +
                "تعزيز صحة القلب ...\n" +
                "تقوية جهاز المناعي ...\n" +
                "تعزيز امتصاص الحديد",R.drawable.p1);
        Student s2 = new Student("الليمون","يساهم عصير الليمون في تنظيم عملية الهضم بفضل احتوائه على نسبة عالية من الألياف الغذائية، مما يمكنه من علاج عسر الهضم، الإمساك والإسهال، ويعزز عمل الأمعاء مما يساعد في الهضم أيضا. كما أنه يساهم في علاج اضطرابات المعدة، ويعتبر مضاد للالتهابات والميكروبات المسببة للمشاكل في الجهاز الهضمي.",R.drawable.p2);
        Student s3 = new Student("التفاح","يحتوي التفاح على كميات جيدة من الألياف، مضادات الأكسدة، مثل فيتامين ج، إضافة إلى البوتاسيوم، ما يعمل على الحفاظ على صحة القلب ومستوى ضغط الدم الطبيعي، والتقليل من نسبة حدوث المضاعفات على القلب",R.drawable.p3);
        Student s4 = new Student("الكمثرى","تساعد الكمثرى في منع هشاشة العظام وذلك لأنها تقوم بالاحتفاظ بالكالسيوم مما يزيد من قوة وصلابة العظام. تحتوي الكمثرى على مضادات أكسدة، مثل: فيتامين ج، والنحاس الذي يحمي خلايا الجسم ويساعده في التخلص من الجذور الحرة",R.drawable.p4);
        Student s5 = new Student("الرمان","المساهمة في علاج ضعف الانتصاب لدى الرجال. تحسين الذاكرة والوقاية من الزهايمر. تحسين الأداء الرياضي، وذلك لاحتواء الرمان على النترات الذي يحسن من تدفق الدم. الوقاية من فقر الدم وتقليل أعراضه، مثل الإرهاق والدوخة، وذلك بسبب احتوائه على الحديد اللازم لصنع خلايا الدم الحمراء بشكل صحي.",R.drawable.p5);
        Student s6 = new Student("جوز الهند","فوائد جوز الهند لصحة الرجال\n" +
                "1- زيادة مستوى طاقة الجسم ...\n" +
                "2- تحسين الصحة الجنسية ...\n" +
                "3- المساعدة في علاج تضخم البروستاتا الحميد ...\n" +
                "4- تقوية الجهاز المناعي ...\n" +
                "5- السيطرة على سكر الدم ...\n" +
                "6- إنقاص الوزن ...\n" +
                "فوائد أخرى لجوز الهند",R.drawable.p6);
        Student s7 = new Student("الأفوكادو"," تعزيز صحة العين وحمايتها من الإصابة بأمراض الضمور البقعي، مثل الجلوكوما، المرتبطة بالتقدم في العمر. - تحسين امتصاص الجسم للكالسيوم، مما يقلل خطر الإصابة بهشاشة العظام. - مكافحة السرطان، لاحتوائه على مضادات الأكسدة.",R.drawable.p7);
        Student s8 = new Student("الخوخ","الوقاية من الإمساك وتحسين حركة الأمعاء؛ وذلك بسبب احتواء الحبة الواحدة من الخوخ على 2 غرام من الألياف الغذائية.\n" +
                "تعزيز نمو البكتيريا النافعة داخل الأمعاء، مما يحسن وظيفة الجهاز الهضمي.",R.drawable.p8);
        Student s9 = new Student("الجزر","يساعد في خسارة الوزن ...\n" +
                "يعزز من مناعة الجسم ...\n" +
                "يقوي العظام والأسنان ...\n" +
                "يحافظ على صحة العيون ...\n" +
                "يقلل من خطر الإصابة بالسرطان ...\n" +
                "يعزز من صحة الجهاز الدوراني ...",R.drawable.p9);
        Student s10 = new Student("الطماطم","يساهم في السيطرة على ضغط الدمّ\n" +
                "يعزز جهاز المناعي لاحتوائه على فيتامين ج\n" +
                "يقلل من الإصابة بإعتام عدسة العين والتنكس البقعي\n" +
                "يعزز نشاط البكتيريا النافعة في الأمعاء\n" +
                "يعزز من صحة القلب والاوعية الدموية ويقلل من تخثر الدمّ",R.drawable.p10);
        Student s11 = new Student("الباذنجان","أحد فوائد أكل الباذنجان النيئ قبل النوم هو أنه يقلل من خطر الإصابة بأمراض القلب والجهاز الدوراني، إذ يحتوي الباذنجان على العديد من الفلافونويدات مثل الأنثوسيانين (Anthocyanin) الذي يقلل من الالتهابات وبالتالي يقلل من خطر الإصابة بأمراض القلب من خلال خفض مستوى ضغط الدم",R.drawable.p11);
        Student s12 = new Student("الفلفل","تعزيز صحة العين ...\n" +
                "تحسين مظهر البشرة ...\n" +
                "خسارة الوزن الزائد ...\n" +
                "علاج الشقيقة ...\n" +
                "الوقاية من السرطان ...\n" +
                "تقليل آلام المفاصل ...\n" +
                "يحارب الالتهابات ...\n" +
                "تقليل خطر الإصابة بقرحة المعدة",R.drawable.p12);
        Student s13 = new Student("البطاطس","البطاطس تحتوي على مقدار منخفض من السعرات الحرارية وتعد غنية بالألياف حيث توفر حماية قوية من الإصابة بأمراض القلب والأوعية الدموية والسرطان. إستناداً إلى تحليل العناصر الغذائية للبطاطس فهي مصدر غني لفيتامين ب6 والبوتاسيوم والحديد والنحاس والمغنسيوم وفيتامين سي والفسفور والألياف والناسين وحمض البانتوثنيك",R.drawable.p13);
        Student s14 = new Student("الخيار","الحفاظ على انتظام الهضم، وتعزيز صحة بكتيريا الأمعاء النافعة، مما قد يساعد على مقاومة: عسر الهضم، وحرقة الفؤاد، والإمساك. ترطيب الجسم من الداخل، مما قد يساعد على تحسين قدرة الجسم على التخلص من السموم. مقاومة بعض الأمراض التي قد يسببها الإجهاد التأكسدي، مثل: مرض التهاب المفاصل، ومرض السرطان",R.drawable.p14);
        Student s15 = new Student("البصل","يدعم تناول البصل النيء صحة القلب بالطرق التالية: خفض ضغط الدم وتقليل خطر الإصابة بنوبة قلبية. تنظيم مستويات الدهون الثلاثية والكوليسترول في الدم. منع تراكم الترسبات مثل الدهون في الشرايين، مما يخفض خطر الإصابة بتصلب الشرايين.",R.drawable.p15);
        Student s16 = new Student("الذرة","القيمة الغذائية للذرة\n" +
                "الوقاية من أمراض القلب:\n" +
                "تنظيم عملية الهضم:\n" +
                "الوقاية من فقر الدم:\n" +
                "الوقاية من السكري:\n" +
                "الوقاية من السرطان:\n" +
                "مجددة للطاقة:\n" +
                "زيادة صحة البشرة:",R.drawable.p16);





        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s6);
        studentArrayList.add(s7);
        studentArrayList.add(s8);
        studentArrayList.add(s9);
        studentArrayList.add(s10);
        studentArrayList.add(s11);
        studentArrayList.add(s12);
        studentArrayList.add(s13);
        studentArrayList.add(s14);
        studentArrayList.add(s15);
        studentArrayList.add(s16);

        studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getFoodtphoto());
        studentNameView.setText(studentArrayList.get(currentStudent).getFoodName());
        studentDescreptionView.setText(studentArrayList.get(currentStudent).getFoodsDiscreption());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getFoodtphoto());
                studentNameView.setText(studentArrayList.get(currentStudent).getFoodName());
                studentDescreptionView.setText(studentArrayList.get(currentStudent).getFoodsDiscreption());


            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent--;
                studentPhotoView.setImageResource(studentArrayList.get(currentStudent).getFoodtphoto());
                studentNameView.setText(studentArrayList.get(currentStudent).getFoodName());
                studentDescreptionView.setText(studentArrayList.get(currentStudent).getFoodsDiscreption());

            }
        });
    }
}