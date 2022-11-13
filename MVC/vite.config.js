import { defineConfig } from 'vite';
import laravel from 'laravel-vite-plugin';
 
export default defineConfig({
    plugins: [
        laravel([
            'resources/vendor/fontawesome-free/css/all.min.css',
            'resources/css/sb-admin-2.min.css',
            'resources/vendor/jquery/jquery.min.js',
            'resources/vendor/jquery-easing/jquery.easing.min.js',
            'resources/js/sb-admin-2.min.js',
            'resources/vendor/chart.js/Chart.min.js',
            'resources/js/demo/chart-area-demo.js',
            'resources/js/demo/chart-pie-demo.js',
        ]),
    ],
});
