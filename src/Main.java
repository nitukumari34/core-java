import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    MyClass myClass=new MyClass();
//    Runnable runnable =()->{
//        for(int i=0;i<=10;i++){
//            System.out.println("hello " + i);
//        }
//    };
////     myClass.run();
//     Thread childThread=new Thread(runnable);
//        childThread.run();
//     for(int i=0;i<=10;i++){
//         System.out.println("bye " + i);
//     }

//        List<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(6);
//        list.add(10);
//

//        old method
        int arr[]={1,2,3,4,5};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2==0){
//                sum+=arr[i];
//            }
//        }
//        System.out.println(sum);

//        using stream

//        int sum= Arrays.stream(arr).filter(n->n%2==0).sum();
//        System.out.println(sum);

//        create stream
//        List<String>list=Arrays.asList("apple","banana","cherry");
//        Stream<String>stream=list.stream();
//        String[]array={"apple","goava","cherry"};
//        Stream<String>stringStream= Arrays.stream(array);
//        Stream<Integer>integerStream=String.of(1,2,4);
//        Stream<Integer>limit=Stream.iterate(0,n->n+1).limit(100);
//        Stream<Integer>limit1=Stream.generate(()-> (int) (Math.random()*100)).limit(100);

//        List<Integer>list=Arrays.asList(1,2,3,90,10,4,4);
//       List<Integer>filteredList= list.stream().filter(x->x%2==0).map(x->x/2).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());
//        System.out.println(filteredList);
//
//        Integer integer=Stream.iterate(0, n->n+1).limit(101).map(x->x/2).distinct().peek(System.out
//                ::println).max((a,b)->a-b).get();
//        Integer integer= Math.toIntExact(Stream.iterate(0, n -> n + 1).limit(101).map(x -> x / 2).distinct().count());
//        System.out.println(integer);

//        LocalDate now = LocalDate.now();
//        System.out.println(
//                now
//        );

//        LocalDate now=LocalDate.now();
//        LocalDate cutomDate = LocalDate.of(1990, 2, 7);
//        int dayOfmonth=now.getDayOfMonth();
//        Month month = now.getMonth();
//        int year = now.getYear();
//
//        System.out.println(dayOfmonth);
//        System.out.println(month);
//        System.out.println(year);
//       LocalDate yesterday=now.minusDays(1);
//        System.out.println(yesterday);
//        if(now.isAfter(yesterday)){
//            System.out.println("haan bhai");
//        }

//
//        LocalTime now=LocalTime.now();
//        System.out.println(now);
//        LocalTime cutomeTime=LocalTime.of(14,30,30);
//        System.out.println(cutomeTime);
//
//        String timeString="15:30:30";
//        LocalTime parsedTime=LocalTime.parse(timeString);
//        System.out.println(parsedTime);
//        LocalTime beforeOneHour=now.minusHours(1);
//        System.out.println(beforeOneHour);
//        if(now.isAfter(beforeOneHour)){
//            System.out.println("yes");
//        }
//localDateTuime
//        LocalDateTime now=LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime myDate = LocalDateTime.parse("2023-01-11T12:45");
//        System.out.println(myDate);

//zone date time

//        ZonedDateTime now=ZonedDateTime.now();
//        System.out.println(now);
//
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        System.out.println(availableZoneIds);
//        ZonedDateTime newYork=ZonedDateTime.now(ZoneId.of("America/New_York"));
//        System.out.println("current time in new York"+newYork);
//
//        ZonedDateTime indiaDateTime=ZonedDateTime.now();
//        ZoneId zdt=indiaDateTime.getZone();
//        System.out.println(zdt);

        //instant
        long currentmillisecond=System.currentTimeMillis();
        System.out.println(currentmillisecond);

        Instant now=Instant.now();
        System.out.println(now);
        //period
        //Duration
        Instant start=Instant.now();
        Instant end=Instant.now();
        Duration d1=Duration.between(start,end);
        System.out.println(d1);
       Duration d2= Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d2);

    }
}