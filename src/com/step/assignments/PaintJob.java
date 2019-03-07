package com.step.assignments;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extra) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extra < 0) {
            return -1;
        }
        double wallArea = width * height;
        int bucketCount = (int) Math.ceil(wallArea / areaPerBucket);
        return bucketCount - extra;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketCount = getBucketCount(width, height, areaPerBucket, 0);
        return bucketCount;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketCount = getBucketCount(1.0, area, areaPerBucket);
        return bucketCount;
    }
}

