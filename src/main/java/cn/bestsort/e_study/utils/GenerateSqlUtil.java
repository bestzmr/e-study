package cn.bestsort.e_study.utils;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.Random;

/**
 * TODO
 *
 * @author bestsort
 * @version 1.0
 * @date 1/2/20 8:29 AM
 */

@Slf4j
public class GenerateSqlUtil {
    private static Faker faker = new Faker(Locale.CHINA);
    private static String url = "url";
    private static String description = "description";
    private static String name = "name";
    private static int maxSchoolHour = 120;
    private static int minSchoolHour = 20;
    private static int defaultWords = 5;
    private static Random random = new Random();
    /**
     * 生成大学信息,为了方便粘贴这里采用了 String 而不是 String[]
     * @param total 要生成的数据总数
     * @return sql集合
     */
    public static String generateCollegeInfoSql(int total){
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= total; i++) {
            res.append(String.format(
                    generateDynamicSql("college_info",8),
                    "area",
                    url,
                    description,
                    "is_double_first",
                    "is_key",
                    "is_undergraduate",
                    "is_art",
                    name,
                    faker.address().state(),
                    faker.internet().url(),
                    generateDescription(),
                    (byte)(faker.number().randomDigit()%2==1?1:0),
                    (byte)(faker.number().randomDigit()%2==1?1:0),
                    (byte)(faker.number().randomDigit()%2==1?1:0),
                    (byte)(faker.number().randomDigit()%2==1?1:0),
                    faker.address().city() + faker.university().suffix()
            ));
            res.append(admissionInfo(i,(byte)1));
        }
        log.info(res.toString());
        return res.toString();
    }

    public static String generateHighSchoolSql(int total){
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= total; i++) {
            res.append(String.format(generateDynamicSql("high_school_info",4),
                    "area",
                    url,
                    description,
                    name,
                    faker.address().state(),
                    faker.internet().url(),
                    generateDescription(),
                    faker.name().firstName() + "中学"
            ));
            res.append(admissionInfo(i,(byte)0));
        }
        return  res.toString();
    }
    public static String generateNetCourseSql(int total){
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= total; i++) {
            res.append(String.format(generateDynamicSql("net_course",3),
                    name,
                    description,
                    url,
                    faker.artist().name(),
                    generateDescription(10),
                    faker.internet().url()));
        }
        return res.toString();
    }
    public static String generateTeacherShowSql(int total){
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= total; i++) {
            String teacher = faker.name().fullName();
            res.append(String.format(generateDynamicSql("teacher_show", 7),
                    "title",
                    description,
                    "editor",
                    "author",
                    "gmt_create",
                    "page_view",
                    "title_img",
                    faker.beer().style() + "! "+ teacher + "  的个人风采",
                    generateDescription(),
                    faker.name().fullName(),
                    faker.name().fullName(),
                    faker.date().birthday(0,30).getTime(),
                    faker.number().digit(),
                    faker.avatar().image()));
        }
        return res.toString();
    }
    public static String generateCourseSql(int total){
        String[] courses = {"语文","数学","英语","体育","计算机","美术"};
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= total; i++) {
            res.append(String.format(generateDynamicSql("course",6),
                    name,
                    "course_img",
                    description,
                    "teacher",
                    "school_hour",
                    "total_people",
                    courses[Math.abs(random.nextInt())%courses.length],
                    faker.avatar().image(),
                    generateDescription(),
                    faker.name().fullName(),
                    faker.number().numberBetween(minSchoolHour,maxSchoolHour),
                    faker.number().randomDigit()
                    ));
        }
        return  res.toString();
    }
    
    private static String admissionInfo(int id,byte isCollege){
        StringBuilder res = new StringBuilder();
        for (int i = 2015; i <= 2019; i++) {
            res.append(String.format(generateDynamicSql("admission_info", 6),
                    "score",
                    "policy",
                    "policy_description",
                    "school_year",
                    "school_id",
                    "is_college",
                    faker.number().randomDouble(2, 100, 750),
                    generateDescription(1),
                    generateDescription(50),
                    i,
                    id,
                    isCollege
                    ));
        }
        return res.toString();
    }
    
    /**
     * 根据 table 和 total 生成插入语句（行和参数需手动填写）
     * @param table 表名
     * @param total 参数个数
     * @return 生成后待填充的sql语句
     */
    private static String generateDynamicSql(String table,int total){
        return "insert into " + table + generateArgs(total) + generateSuffix(total);
    }
    private static String generateSuffix(int total){
        StringBuilder res = new StringBuilder("values (");
        for (int i = 1; i <= total; i++) {
            if (i != 1) {
                res.append(",'%s'");
            }else {
                res.append("'%s'");
            }
        }
        return res.append(");\n").toString();
    }
    private static String generateDescription(int num){
        return faker.lorem().words(num).toString();
    }

    private static String generateDescription(){
        return faker.lorem().words(defaultWords).toString();
    }
    private static String generateArgs(int total){
        StringBuilder res = new StringBuilder(" (");
        for (int i = 1; i <= total; i++) {
            if (i != 1) {
                res.append(",%s");
            }else {
                res.append("%s");
            }
        }
        return res.append(") ").toString();
    }
}
